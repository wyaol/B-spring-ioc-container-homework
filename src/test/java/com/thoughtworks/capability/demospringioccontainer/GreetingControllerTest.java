package com.thoughtworks.capability.demospringioccontainer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTest {

    @Resource
    MockMvc mockMvc;

    @Test
    void greet() throws Exception {
        mockMvc.perform(get("/greet"));
        mockMvc.perform(get("/greet"));
        mockMvc.perform(get("/greet"));
        assertEquals(3, GreetingService.getCount());
    }

}
