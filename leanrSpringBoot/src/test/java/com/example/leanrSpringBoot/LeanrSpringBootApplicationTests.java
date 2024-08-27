package com.example.leanrSpringBoot;

import com.springBoot.leanrSpringBoot.LeanrSpringBootApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LeanrSpringBootApplication.class) // if main class is in same package then no need to specify otherwise you need to specify class
class LeanrSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

}
