package com.kelsonthony.cameldeveloperdemo.route;


import static org.apache.camel.LoggingLevel.ERROR;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "camel.hello.enabled", havingValue = "true")
public class HelloRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:greeting")
			.log(ERROR, "Hello ${body}")
			.choice()
				.when()
				.simple("${body} contains 'Team'")
				.log(ERROR, "I like to working with Teams")
			.otherwise()
				.log(ERROR, "Sollo Fighter :)")
			.end()
			.end();
		
		
	}
}
