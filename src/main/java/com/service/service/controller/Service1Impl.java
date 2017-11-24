package com.service.service.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-24T05:06:07.268Z")

@RestSchema(schemaId = "service1")
@RequestMapping(path = "/service", produces = MediaType.APPLICATION_JSON)
public class Service1Impl {

    @Autowired
    private Service1Delegate userService1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userService1Delegate.helloworld(name);
    }

}
