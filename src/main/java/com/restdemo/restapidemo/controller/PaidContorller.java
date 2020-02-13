package com.restdemo.restapidemo.controller;


import com.restdemo.restapidemo.domain.PaidRequest;
import com.restdemo.restapidemo.domain.PaidResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/patmnet/{transid}/paid")
public class PaidContorller {

    @Autowired
    PaidResponse response;

    @PostMapping
    public PaidResponse requestPaid(@PathVariable String transid, @RequestBody PaidRequest request){
        String result = "transid[" + transid + "]" + " request[" + request.toString() + "]";
        System.out.println(result);
        response.resultCode = "0000";
        response.resultMessage = "success";
        return response;
    }


}
