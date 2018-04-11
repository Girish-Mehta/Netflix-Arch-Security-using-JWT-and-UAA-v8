package com.demo.uaa.uaaserver;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//accesing db service through feign client
@FeignClient(value="zuul")
@RibbonClient(name="registration-service")
public interface UserInformationProxy {

	@PostMapping("registration-service/login")
	public String getUserInformationn(@RequestBody UserInformation userInfoInBody);
}