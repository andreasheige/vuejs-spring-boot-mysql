package com;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class TaskAgileApplicationTests {

	@Test
	public void contextLoads() {
	}

}
