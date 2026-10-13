val kotlin_version: String by project
val logback_version: String by project
val h2_version: String by project
val exposed_version: String by project

plugins {
  kotlin("jvm") version "2.4.20"
  id("io.ktor.plugin") version "3.6.0"
  id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
}

group = "com.example"

version = "0.0.1"

application {
  mainClass.set("com.example.MVCApplicationKt")
  val isDevelopment: Boolean = project.ext.has("development")
  applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
  mavenCentral()
  maven {
    url = uri("https://redirector.kotlinlang.org/maven/ktor-eap")
  }
}
