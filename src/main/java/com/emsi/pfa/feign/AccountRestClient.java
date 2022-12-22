package com.emsi.pfa.feign;

import com.emsi.pfa.dto.PassengerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8081", path = "/",name = "accounts-app")
public interface AccountRestClient {
    @GetMapping(value = "passengers/{passengerPublicId}")
    PassengerDTO getPassengerByPublicId(@PathVariable String passengerPublicId);
}