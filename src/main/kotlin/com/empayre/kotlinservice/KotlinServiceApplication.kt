package dev.vality.kotlinservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@ServletComponentScan
@SpringBootApplication
class KotlinServiceApplication : SpringApplication()

fun main(args: Array<String>) {
    runApplication<KotlinServiceApplication>(*args)
}
