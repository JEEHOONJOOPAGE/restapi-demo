package com.restdemo.restapidemo.controller;


import com.restdemo.restapidemo.domain.AcceptRequest;
import com.restdemo.restapidemo.domain.AcceptResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/patmnets/accept")
public class AcceptController {

    @Autowired
    AcceptResponse response;

    @PostMapping
    public AcceptResponse authentication(@RequestBody AcceptRequest request){
        System.out.println(request.toString());
        response.resultCode = "0000";
        response.resultMessage = "success";
        response.transid = "TEST2020021400000001";
        System.out.println(response);
        return response;
    }




}
