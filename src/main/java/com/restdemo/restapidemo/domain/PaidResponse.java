package com.restdemo.restapidemo.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;


@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaidResponse {

    @JsonProperty("result_code") public String resultCode;
    @JsonProperty("result_message") public String resultMessage;

    @Override
    public String toString() {
        return "PaidResponse{" +
                "resultCode='" + resultCode + '\'' +
                ", resultMessage='" + resultMessage + '\'' +
                '}';
    }
}
