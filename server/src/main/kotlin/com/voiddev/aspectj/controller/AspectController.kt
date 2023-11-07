package com.voiddev.aspectj.controller

import com.voiddev.aspectj.service.AspectService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AspectController(
    val aspectService: AspectService
) {

    @GetMapping("/aspect")
    fun aspect(): String {
        return aspectService.randomFunction()
    }
}