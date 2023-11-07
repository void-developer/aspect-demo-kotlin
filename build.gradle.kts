import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "3.1.5"
  id("io.spring.dependency-management") version "1.1.3"
  id("io.freefair.aspectj.post-compile-weaving") version "8.4"
  kotlin("jvm") version "1.8.22"
  kotlin("plugin.spring") version "1.8.22"
}

group = "com.voiddev"


//apply(plugin = "io.freefair.aspectj.post-compile-weaving")

allprojects {
  apply(plugin = "org.jetbrains.kotlin.jvm")
  apply(plugin = "kotlin-spring")
  apply(plugin = "io.spring.dependency-management")
  apply(plugin = "org.springframework.boot")
  apply(plugin = "io.freefair.aspectj.post-compile-weaving")

  version = "0.0.1-SNAPSHOT"
  java {
    sourceCompatibility = JavaVersion.VERSION_17
  }

  repositories {
    mavenLocal()
    mavenCentral()
  }

  dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation("org.aspectj:aspectjrt:1.9.19")
  }

  tasks.withType<KotlinCompile> {
    kotlinOptions {
      freeCompilerArgs += "-Xjsr305=strict"
      jvmTarget = "17"
    }
  }

  tasks.withType<Test> {
    useJUnitPlatform()
  }
}
