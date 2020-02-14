package com.restdemo.restapidemo.controller;


import com.restdemo.restapidemo.domain.RefundRequest;
import com.restdemo.restapidemo.domain.RefundResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/patmnets/{transid}/refund")
public class RefundController {

    @Autowired
    RefundResponse response;

    @PostMapping
    public RefundResponse orderRefund(@PathVariable String transid, @RequestBody RefundRequest request){
        request.transid = transid;
        System.out.println(request);
        response.resultCode = "0000";
        response.resultMessage = "success";
        response.transid = request.transid;
        response.refundid = "TESTREFUND0000001";
        response.cur = request.cur;
        response.amt = request.amt;
        System.out.println(response);
        return response;
    }



}
