package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService1 {

        Service1Delegate service1Delegate = new Service1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = service1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}