package com.mineminds.server.service

import org.springframework.stereotype.Service

data class LevelData(
    val courseId: Int,
    val levelId: Int,
    val title: String,
    val imageUrl: String,
    val content: String
)

@Service
class LevelService {
        fun getAllLevels(): List<LevelData> {
            // Simulating dummy course data
            return listOf(
                LevelData(courseId = 1, levelId = 1, imageUrl = "https://i.ibb.co/FYP63Jy/Mathematics-Banner.webp",title="Jegan", content = "jsjs"),

            )
        }

    fun getLevel(levelId:Int): LevelData {
        // Simulating dummy course data
        return getAllLevels().find { it.levelId == levelId }!!
    }
}