package com.formation.marsrover.rover

import com.formation.marsrover.domain.NasaInstruction
import com.formation.marsrover.domain.Rover.Direction.*
import com.formation.marsrover.domain.Movement.B
import com.formation.marsrover.domain.Movement.F
import com.formation.marsrover.domain.Rover.Position
import com.formation.marsrover.domain.Rover.Rover
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverTests {

    @Test
    internal fun `should return rover start position facing a direction`() {
        val rover = Rover(Position(), S)

        assertThat(rover).isEqualTo(Rover(Position(0, 0), S))
    }

    @Test
    internal fun `should move the rover forward`() {
        val rover = Rover(Position(), N)
        val nasaInstructions: List<NasaInstruction> = listOf(NasaInstruction(F))

        val roverPosition = rover.execute(nasaInstructions)

        assertThat(roverPosition).isEqualTo(Rover(Position(0, 1), N))
    }

    @Test
    internal fun `should move the rover backward`() {
        val rover = Rover(Position(), W)
        val nasaInstructions: List<NasaInstruction> = listOf(NasaInstruction(B))

        val roverPosition = rover.execute(nasaInstructions)

        assertThat(roverPosition).isEqualTo(Rover(Position(1, 0), W))
    }
}
