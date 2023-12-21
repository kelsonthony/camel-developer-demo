package com.kelsonthony.cameldeveloperdemo.route;

import java.util.Date;

import static org.apache.camel.LoggingLevel.ERROR;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.support.DefaultMessage;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static java.util.concurrent.TimeUnit.SECONDS;

@Component
@ConditionalOnProperty(name = "kelsonthony.camelswaggerdemo.enabled", 
havingValue = "true")
//, matchIfMissing = true)
public class SedaRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer:ping?period=200")
			.process(exchange -> {
				Message message = new DefaultMessage(exchange);
				message.setBody(new Date());
				exchange.setMessage(message);
			})
			.to("seda:weightLifter?multipleConsumers=true");

		
		from("seda:weightLifter?multipleConsumers=true")
			.to("direct:complexProcess");
		
		from("direct:complexProcess")
			.log(ERROR, "${body}")
			.process(exchange -> SECONDS.sleep(2))
			.end();
	}
}
