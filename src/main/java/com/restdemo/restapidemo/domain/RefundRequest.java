package com.restdemo.restapidemo.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefundRequest {

    @JsonProperty("pnr_no") public String pnrNo;
    @JsonProperty("transid") public String transid;
    @JsonProperty("cur") public String cur;
    @JsonProperty("amt") public String amt;

    @Override
    public String toString() {
        return "RefundRequest{" +
                "pnrNo='" + pnrNo + '\'' +
                ", transid='" + transid + '\'' +
                ", cur='" + cur + '\'' +
                ", amt='" + amt + '\'' +
                '}';
    }
}
