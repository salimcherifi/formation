package com.formation.marsrover.domain

data class Rover(val position: Position, val direction: Direction) {
    fun execute(commands: List<Command>): Rover {
        val y = commands.fold(position.y) { acc, current -> acc.plus(current.movement.value) }

        return Rover(position.copy(y = y), Direction.N)
    }
}
