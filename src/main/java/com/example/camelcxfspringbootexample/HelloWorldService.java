package com.example.camelcxfspringbootexample;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "HelloWorldService", targetNamespace = "com.example.camelcxfspringbootexample")
public interface HelloWorldService {

    @WebMethod
    public String sayHello();
}
