package com.myslyv4uk.simpleaop;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.myslyv4uk.simpleaop.service.SayService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleAopApplicationTests {

	@Autowired
	private SayService sayService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSay(){
		sayService.sayHi();
		sayService.sayBye();
		sayService.retrunSmthn(LocalDateTime.now());
	}

}
