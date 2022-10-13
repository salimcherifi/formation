package com.formation.marsrover.rover

import com.formation.marsrover.domain.Direction.*
import com.formation.marsrover.domain.Position
import com.formation.marsrover.domain.Rover
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class RoverTests {


    @Test
    internal fun `should return rover start position facing a direction`() {
        val rover = Rover(Position(), S)

        assertThat(rover).isEqualTo(Rover(Position(0, 0), S))
    }
}