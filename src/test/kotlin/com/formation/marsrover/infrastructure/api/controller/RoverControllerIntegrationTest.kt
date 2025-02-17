package com.formation.marsrover.infrastructure.api.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.formation.marsrover.infrastructure.api.RoverAdapter
import com.formation.marsrover.infrastructure.api.RoverView
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status



@SpringBootTest
@AutoConfigureMockMvc
class RoverControllerIntegrationTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var jsonMapper: ObjectMapper

    @MockkBean
    private lateinit var roverAdapter: RoverAdapter

    @Test
    fun `should get rover`() {
    every { roverAdapter.getOne() }returns RoverView(0, 0, "N")
        mockMvc.perform(
            MockMvcRequestBuilders.get("/rover")
        ).andExpect(
            status().isOk
        ).andExpect(content().json(jsonMapper.writeValueAsString(RoverView(0, 0, "N"))))
    }
}
