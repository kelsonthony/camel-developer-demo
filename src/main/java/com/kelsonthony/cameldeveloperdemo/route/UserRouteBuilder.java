package com.kelsonthony.cameldeveloperdemo.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class UserRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
    	
   
    		
//    	rest("/test").get()
//    		.to("direct:userRoute");
    	
        from("direct:userRoute")
            .log("Hello user Route");
    }
}