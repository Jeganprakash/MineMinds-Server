package com.mineminds.server.controller

import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import java.security.MessageDigest

data class UserRequest(val username: String)
data class TokenResponse(val data: TokenData)
data class TokenData(val token: String)

@RestController
@RequestMapping("/api")
class UserController {

    @PostMapping("/user")
    fun getToken(@RequestBody userRequest: UserRequest): ResponseEntity<TokenResponse> {
        val token = generateToken(userRequest.username)
        val response = TokenResponse(TokenData(token))
        return ResponseEntity(response, HttpStatus.OK)
    }

    private fun generateToken(username: String): String {
        // Hash the username with SHA-256
        val digest = MessageDigest.getInstance("SHA-256")
        val hash = digest.digest(username.toByteArray()).joinToString("") {
            "%02x".format(it)
        }
        return hash
    }
}
