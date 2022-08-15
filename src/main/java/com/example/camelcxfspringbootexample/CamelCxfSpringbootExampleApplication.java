package com.example.camelcxfspringbootexample;


import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.namespace.QName;

@SpringBootApplication
public class CamelCxfSpringbootExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamelCxfSpringbootExampleApplication.class, args);
    }

    @Bean
    public CxfEndpoint test(){
        CxfEndpoint test  =new CxfEndpoint();
        test.setAddress("/hello");
        test.setServiceClass(HelloWorldService.class);
        test.setServiceNameAsQName(new QName("com.example.camelcxfspringbootexample", "HelloService"));
        test.setEndpointNameAsQName(new QName("com.example.camelcxfspringbootexample", "HelloServicePort"));
        return test;
    }

}
