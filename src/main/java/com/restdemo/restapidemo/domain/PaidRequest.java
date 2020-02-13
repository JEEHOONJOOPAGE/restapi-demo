package com.restdemo.restapidemo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;


@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaidRequest {


    @JsonProperty("pnr") public String pnr;
    @JsonProperty("transid") public String transid;
    @JsonProperty("cur") public String cur;
    @JsonProperty("amt") public String amt;

    @Override
    public String toString() {
        return "PaidRequest{" +
                "pnr='" + pnr + '\'' +
                ", transid='" + transid + '\'' +
                ", cur='" + cur + '\'' +
                ", amt='" + amt + '\'' +
                '}';
    }
}
