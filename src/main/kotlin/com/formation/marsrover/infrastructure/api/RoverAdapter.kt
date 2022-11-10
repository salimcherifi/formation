package com.formation.marsrover.infrastructure.api

import com.formation.marsrover.domain.command.GetRover
import org.springframework.stereotype.Component

@Component
class RoverAdapter(private val getRover: GetRover) {


    fun getOne(): RoverView {
        return getRover.execute().let {
            RoverView.from(it)
        }
    }

}
