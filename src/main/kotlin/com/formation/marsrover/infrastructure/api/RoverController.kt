package com.formation.marsrover.infrastructure.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RoverController(
    private val roverAdapter: RoverAdapter
) {

    @GetMapping("/rover")
    fun getRover(): ResponseEntity<RoverView> {
        return ResponseEntity.ok(roverAdapter.getOne())
    }

}