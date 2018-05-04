package com.phicomm.eureka.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/sayHi")
	public String sayHi() {
		return "hi";
	}
}
