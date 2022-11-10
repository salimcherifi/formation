package com.formation.marsrover.infrastructure.api.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.formation.marsrover.domain.command.GetRover
import com.formation.marsrover.infrastructure.api.RoverAdapter
import com.formation.marsrover.infrastructure.api.RoverView
import io.mockk.impl.annotations.MockK
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest
@AutoConfigureMockMvc
class RoverAdapterTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var jsonMapper: ObjectMapper

    @InjectMocks
    private lateinit var roverAdapter: RoverAdapter

    @Mock
    private lateinit var getRover: GetRover

    @Test
    fun `should return a RoverView`() {
        var roverView = roverAdapter.getOne();
        assertThat(roverView).isEqualTo(RoverView(0,0, "N"));
    }
}
