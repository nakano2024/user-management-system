package com.example.authentication.controllers;

import com.example.authentication.utilities.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("/test")
    public ResponseEntity<String> index(){
        final String token = jwtUtil.generateAccessToken("0234vds-23vd34sa-343fsa13v-3fw334", "name");
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @GetMapping("/auth/test")
    public ResponseEntity<String> index2(){
        return new ResponseEntity<>("AuthHelloWorld", HttpStatus.OK);
    }
}
