package com.kelsonthony.cameldeveloperdemo.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MainRestRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
    	
//    	restConfiguration()
//	        .component("servlet")
//	        //.bindingMode(RestBindingMode.json)
//	        //.dataFormatProperty("prettyPrint", "true")
//	        //.apiContextPath("/api-doc")
//	        //.apiContextPath("/swagger")
//	        //.apiContextRouteId("swagger-route")
//	        //.apiProperty("api.title", "Saggu.UK Camel Rest APIs")
//	        //.apiProperty("api.version", "1.0")
//	        .contextPath("/camel-demo/v1");
    		
//    	rest("/test").get()
//    		.to("direct:userRoute");
    	rest()
    		.consumes("application/json")
    		.produces("application/json")
    		.get("/test")
    		.to("direct:userRoute");
//        from("direct:userRoute")
//            .log("Hello user Route");
    }
}