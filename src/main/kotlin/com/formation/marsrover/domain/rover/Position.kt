package com.formation.marsrover.domain.rover

data class Position(val x: Int = 0, val y: Int = 0) {

    operator fun plus(position: Position): Position {
        return Position(
            x = this.x + position.x,
            y = this.y + position.y
        )
    }
}
