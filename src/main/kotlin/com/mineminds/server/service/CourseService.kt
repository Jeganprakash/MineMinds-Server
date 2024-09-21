package com.mineminds.server.service

import org.springframework.stereotype.Service

data class CourseData(
    var courseName:String?,
    var courseId:Long?,
    var thumbnailUrl:String?,
)

@Service
class CourseService {
        fun getAllCourses(): List<CourseData> {
            // Simulating dummy course data
            return listOf(
                CourseData(courseName = "Mathematics", courseId = 1, thumbnailUrl = "https://i.ibb.co/FYP63Jy/Mathematics-Banner.webp"),
                CourseData(courseName = "Physics", courseId = 2, thumbnailUrl = "https://i.ibb.co/FYP63Jy/Mathematics-Banner.webp"),
                CourseData(courseName = "Chemistry", courseId = 3, thumbnailUrl = "https://i.ibb.co/FYP63Jy/Mathematics-Banner.webp")
            )
        }
}