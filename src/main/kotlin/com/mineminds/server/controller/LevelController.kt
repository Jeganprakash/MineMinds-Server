package com.mineminds.server.controller

import com.mineminds.server.service.CourseData
import com.mineminds.server.service.CourseService
import com.mineminds.server.service.LevelData
import com.mineminds.server.service.LevelService
import org.apache.catalina.connector.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

data class LevelRequest(val username: String)
data class LevelResponse(
    val data: List<LevelData>
)

data class LevelSingleResponse(
    val data: LevelData
)



@RestController
@RequestMapping("/api")
class LevelController {

    @Autowired
    private lateinit var levelService: LevelService
    @GetMapping("/levels")
    fun getAllLevels(): ResponseEntity<LevelResponse> {
        println("levels")
        val response = LevelResponse(data = levelService.getAllLevels())
        return ResponseEntity(response, HttpStatus.OK)
    }

    @GetMapping("/level")
    fun getCourse(@RequestParam id:Int?=1): ResponseEntity<LevelSingleResponse> {
        val response = LevelSingleResponse(data = levelService.getLevel(1))
        return ResponseEntity(response, HttpStatus.OK)
    }

}