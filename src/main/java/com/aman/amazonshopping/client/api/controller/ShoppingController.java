/**
 * 
 */
package com.aman.amazonshopping.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author amanb
 *
 */
@RestController
@RequestMapping("/payments")
public class ShoppingController {
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/amazon-payment/{price}")
	public String invokePayment(@PathVariable int price) {
		
		String url="http://PAYMENT-SERVICE/payment/payNow/"+price;
		return template.getForObject(url, String.class);
		
	}

}
