package com.voiddev.aspectj

import com.voiddev.aspectj.service.AspectService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerApplication

fun main(args: Array<String>) {
  runApplication<ServerApplication>(*args).use {
    println(it.getBean(AspectService::class.java).randomFunction())
  }
}
