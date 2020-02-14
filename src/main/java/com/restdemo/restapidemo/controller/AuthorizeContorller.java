package com.restdemo.restapidemo.controller;


import com.restdemo.restapidemo.domain.AuthorizeRequest;
import com.restdemo.restapidemo.domain.AuthorizeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/patmnets/{transid}/authorize")
public class AuthorizeContorller {

    @Autowired
    AuthorizeResponse response;

    @PostMapping
    public AuthorizeResponse requestPaid(@PathVariable String transid, @RequestBody AuthorizeRequest request){
        request.transid = transid;
        System.out.println(request.toString());
        response.resultCode = "0000";
        response.resultMessage = "success";
        System.out.println(response);
        return response;
    }

}
