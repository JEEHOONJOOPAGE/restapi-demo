package com.restdemo.restapidemo.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptRequest {

    @JsonProperty("pnr_no") public String pnrNo;
    @JsonProperty("user_id") public String userId;
    @JsonProperty("credit_card_number") public String creditCardNumber;
    @JsonProperty("cur") public String cur;
    @JsonProperty("amt") public String amt;


    @Override
    public String toString() {
        return "AcceptRequest{" +
                "pnrNo='" + pnrNo + '\'' +
                ", userId='" + userId + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", cur='" + cur + '\'' +
                ", amt='" + amt + '\'' +
                '}';
    }
}
