package com.example.springsecurity.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/_v1/auth")
public class AuthController {
    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String getList(){return "Hello World";}
}
