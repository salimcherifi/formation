package com.formation.marsrover.domain

enum class Movement(val step: Position) {
    F(Position(0, 1)),
    B(Position(1, 0))
}
