package com.formation.marsrover.domain

data class Rover(val position: Position, val direction: Direction) {
    fun execute(commands: List<Command>): Rover {
        val position: Position = this.position + commands.first().movement.step
        return Rover(position, direction)
    }
}
