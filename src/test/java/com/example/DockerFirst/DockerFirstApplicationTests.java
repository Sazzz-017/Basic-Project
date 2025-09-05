package com.example.DockerFirst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerFirstApplicationTests {

    @Test
    void testAdd() {
        // testing the add method
        int result = DockerFirstApplication.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");

        int result1 = DockerFirstApplication.add(10,5);
        assertEquals(15, result, "10 + 5 should equal 15");

        int result2 = DockerFirstApplication.mul(10,5);
        assertEquals(50, result, "10 * 5 should equal 50");
    }
}
