package com.formation.marsrover.infrastructure.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RoverController {

    @RequestMapping("/rover")
    fun getRover() {

    }

}