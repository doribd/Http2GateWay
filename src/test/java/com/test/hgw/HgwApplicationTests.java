package com.test.hgw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * Later to be implemented with the webclient.
 *
 * @author dor
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HgwApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void a() {
        WebTestClient testClient = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();

    }
}
