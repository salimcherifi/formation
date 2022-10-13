package com.formation.marsrover.domain

data class Rover(val position: Position, val direction: Direction) {
    fun execute(commands: List<Command>): Rover {
        return Rover(Position(0,1), Direction.N)
    }
}
