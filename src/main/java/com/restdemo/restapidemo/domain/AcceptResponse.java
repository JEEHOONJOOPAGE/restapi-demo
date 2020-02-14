package com.restdemo.restapidemo.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptResponse {

    @JsonProperty("result_code") public String resultCode;
    @JsonProperty("result_message") public String resultMessage;
    @JsonProperty("transid") public String transid;

    @Override
    public String toString() {
        return "AcceptResponse{" +
                "resultCode='" + resultCode + '\'' +
                ", resultMessage='" + resultMessage + '\'' +
                ", transid='" + transid + '\'' +
                '}';
    }
}
