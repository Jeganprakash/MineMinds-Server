package com.mineminds.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MinemindsApplication

fun main(args: Array<String>) {
	runApplication<MinemindsApplication>(*args)
}
