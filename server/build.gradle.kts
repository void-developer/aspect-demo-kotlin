import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.3"
    id("io.freefair.aspectj.post-compile-weaving") version "6.6.3"
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22"
}

group = "com.voiddev"

dependencies {
    implementation(project(":common"))
}

tasks {
    bootJar {
        archiveBaseName.set(rootProject.name)
    }
}
