package net.cloudyrock.kotlinDemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kotlin")
class KotlinController {

    @GetMapping
    fun getString() : String {
        return "Kotlin controller"
    }
}