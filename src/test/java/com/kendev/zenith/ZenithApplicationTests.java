package com.kendev.zenith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestContainersConfig.class)
class ZenithApplicationTests {

    @Test
    void contextLoads() {
    }
}