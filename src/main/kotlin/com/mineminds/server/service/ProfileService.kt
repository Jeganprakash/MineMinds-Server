package com.mineminds.server.service

import java.time.LocalDate
import org.springframework.stereotype.Service
data class UserProfile(
    val userId: Long,
    var xpPoints: Int,
    var coins: Int,
    var streak: Int,
    var lastCompletedDate: LocalDate
)



@Service
class ProfileService(private val levelService: LevelService) {

    // Simulating in-memory user profiles. Ideally, connect this to a database.
    private val userProfiles: MutableMap<Long, UserProfile> = mutableMapOf()

    fun getUserProfile(userId: Long): UserProfile {
        return userProfiles[userId] ?: createUserProfile(userId)
    }

    fun completeLevel(userId: Long, levelId: Int): UserProfile {
        val userProfile = userProfiles[userId] ?: createUserProfile(userId)
        val levelData = levelService.getLevel(levelId)

        // Award XP and coins based on level completion
        userProfile.xpPoints += 100  // Assuming each level completion grants 100 XP
        userProfile.coins += 50      // Assuming each level completion grants 50 coins

        // Update streak if the user completes a level consecutively
        val today = LocalDate.now()
        if (userProfile.lastCompletedDate == today.minusDays(1)) {
            userProfile.streak += 1
        } else if (userProfile.lastCompletedDate != today) {
            userProfile.streak = 1
        }
        userProfile.lastCompletedDate = today

        userProfiles[userId] = userProfile
        return userProfile
    }

    private fun createUserProfile(userId: Long): UserProfile {
        val userProfile = UserProfile(userId, 0, 0, 1, LocalDate.now().minusDays(2))
        userProfiles[userId] = userProfile
        return userProfile
    }
}
