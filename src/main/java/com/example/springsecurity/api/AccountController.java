package com.example.springsecurity.api;

import com.example.springsecurity.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AccountController {
    final AccountService accountService;

    @RequestMapping(path = "register", method = RequestMethod.POST)
    public ResponseEntity<?>register(@RequestBody AccountRegisterDto accountRegisterDto){
        return ResponseEntity.of().body(accountService.register(accountRegisterDto));
    }
    @RequestMapping(path = "login", method = RequestMethod.POST)
    public ResponseEntity<?>login(@RequestBody AccountLoginDto accountLoginDto){
        return ResponseEntity.ok().body(accountService.login(accountLoginDto));
    }
    @RequestMapping(method = RequestMethod.GET)
    public String getInformation(){
        return "";
    }
}
