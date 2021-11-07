package com.demo.server;

import com.demo.server.ext.web.DemoServerExtApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoServerExtApplication.class)
public class TestDemoServerExtApplication {

    @Test
    public void test() {
        testDemoServerApplication();
    }

    private void testDemoServerApplication() {
        System.out.println("=== Hello Demo Spring Boot Application! ===");
    }
}
