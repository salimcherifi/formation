package com.formation.marsrover.domain

import com.formation.marsrover.domain.rover.Position

enum class Movement(val step: Position) {
    F(Position(0, 1)),
    B(Position(1, 0))
}
