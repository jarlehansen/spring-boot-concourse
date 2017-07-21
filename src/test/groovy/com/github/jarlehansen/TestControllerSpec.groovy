package com.github.jarlehansen

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class TestControllerSpec extends Specification {
    private TestController controller
    private MockMvc mockMvc

    void setup() {
        controller = new TestController()
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build()
    }

    def "GET text"() {
        when:
        def response = mockMvc.perform(get('/test'))

        then:
        response.andExpect(status().isOk())
    }
}

