package se.distansakademin.rest_ez;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MainController.class)
public class MainControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getHello_ShouldReturnGreeting() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello my friend"));

    }


    @Test
    public void getGoodBye_shouldReturnGoodBye() throws Exception{
        mockMvc.perform(get("/goodbye"))
                .andExpect(status().isOk())
                .andExpect(content().string("Good bye my friend"));
    }

    @Test
    public void simpleTest() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk());
    }

}
