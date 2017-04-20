package uk.co.agilesphere.testapplication.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {

    private static Logger logger = LoggerFactory.getLogger(PersonControllerTest.class);

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnListPage() throws Exception {
        logger.debug(">>>>>>>>>>>>>>> shouldReturnListPage");
        this.mockMvc.perform(get("/list"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("People")));
    }

}
