package com.formation.marsrover.domain.rover

import com.formation.marsrover.domain.NasaInstruction

data class Rover(val position: Position, val direction: Direction) {
    fun execute(nasaInstructions: List<NasaInstruction>): Rover {
        val position: Position = this.position + nasaInstructions.first().movement.step
        return Rover(position, direction)
    }
}
