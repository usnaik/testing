package com.upen.pm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upen.pm.api.dto.OrderRequest;
import com.upen.pm.api.dto.OrderResponse;
import com.upen.pm.api.service.OrderService;

@SpringBootApplication
@RestController
public class PowermockApiApplication {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/placeOrder")
	public OrderResponse placeOrder(@RequestBody OrderRequest request){
		return service.checkoutOrder(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(PowermockApiApplication.class, args);
	}

}

