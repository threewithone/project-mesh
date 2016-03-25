package com.boatofthree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MockController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getAllBusTypes(){
        return "Hello World";
    }
}
