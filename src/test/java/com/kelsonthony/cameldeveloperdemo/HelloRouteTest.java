package com.kelsonthony.cameldeveloperdemo;

import org.apache.camel.ProducerTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CamelDeveloperDemoApplication.class, 
properties = {"camel.hello.enabled=true"})
public class HelloRouteTest {

	@Autowired
	private ProducerTemplate template;
	
	@Test
	void testMockAreValid() {
		System.out.println("Sending 1");
		template.sendBody("direct:greeting", "Team");
		System.out.println("Sendind 2");
		template.sendBody("direct:greeting", "Me");
	}
}
