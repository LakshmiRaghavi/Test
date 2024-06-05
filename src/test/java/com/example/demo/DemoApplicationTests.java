package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private  Test1 test1;
	@Test
	void contextLoads() {
	String str="dood";

		assertTrue(test1.Testing(str));
	}
	@Test
	void falseCase(){
		String str="fdes";
		assertFalse(test1.Testing(str));
	}
}
