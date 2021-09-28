package com.in28minutes.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean basicAuthenticationBean(){
        return new AuthenticationBean("successful authentication");
    }

}
