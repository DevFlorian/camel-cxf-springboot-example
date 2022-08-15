package com.example.camelcxfspringbootexample;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("cxf:bean:test")
          .setBody(constant("Hello World!"));
    }
}
