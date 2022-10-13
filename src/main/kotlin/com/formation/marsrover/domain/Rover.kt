package com.formation.marsrover.domain

data class Rover(val position: Position, val direction: Direction) {
    fun receive(commands: List<Command>): List<Command> {
        return commands
    }
}
