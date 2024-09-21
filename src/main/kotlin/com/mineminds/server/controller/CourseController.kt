package com.mineminds.server.controller

import com.mineminds.server.service.CourseData
import com.mineminds.server.service.CourseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

data class CourseRequest(val username: String)
data class CourseResponse(
    val data: List<CourseData>
)


@RestController
@RequestMapping("/api")
class CourseController {

    @Autowired
    private lateinit var courseService: CourseService
    @GetMapping("/courses")
    fun getCourses(): ResponseEntity<CourseResponse> {
        val response = CourseResponse(data = courseService.getAllCourses())
        return ResponseEntity(response, HttpStatus.OK)
    }

    @GetMapping("/courses/:id/levels")
    fun getCourse(@RequestParam id:Int): ResponseEntity<CourseResponse> {
        val response = CourseResponse(data = courseService.getAllCourses())
        return ResponseEntity(response, HttpStatus.OK)
    }

}