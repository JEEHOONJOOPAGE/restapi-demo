package com.restdemo.restapidemo.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefundResponse {


    @JsonProperty("result_code") public String resultCode;
    @JsonProperty("result_message") public String resultMessage;
    @JsonProperty("refundid") public String refundid;
    @JsonProperty("transid") public String transid;
    @JsonProperty("cur") public String cur;
    @JsonProperty("amt") public String amt;

    @Override
    public String toString() {
        return "RefundResponse{" +
                "resultCode='" + resultCode + '\'' +
                ", resultMessage='" + resultMessage + '\'' +
                ", refundid='" + refundid + '\'' +
                ", transid='" + transid + '\'' +
                ", cur='" + cur + '\'' +
                ", amt='" + amt + '\'' +
                '}';
    }
}
