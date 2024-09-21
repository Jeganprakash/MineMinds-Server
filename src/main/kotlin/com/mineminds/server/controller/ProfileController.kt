package com.mineminds.server.controller

import com.mineminds.server.service.ProfileService
import com.mineminds.server.service.UserProfile
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProfileController(private val profileService: ProfileService) {

    @GetMapping("/profile/{userId}")
    fun getUserProfile(@PathVariable userId: Long): UserProfile {
        return profileService.getUserProfile(userId)
    }

    @GetMapping("/profile/{userId}/completeLevel/{levelId}")
    fun completeLevel(@PathVariable userId: Long, @PathVariable levelId: Int): UserProfile {
        return profileService.completeLevel(userId, levelId)
    }
}
