package com.formation.marsrover.infrastructure.api

import com.formation.marsrover.domain.Rover.Rover

data class RoverView(val x: Int, val y: Int, val direction: String) {
    companion object {
        fun from(rover: Rover): RoverView {
            TODO("NOT YET IMPLEMENTED")
        }
    }


}
