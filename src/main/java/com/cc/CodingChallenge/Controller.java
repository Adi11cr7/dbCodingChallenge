package com.cc.CodingChallenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cc.CodingChallenge.Repository;


@RestController

public class Controller {

	@Autowired
	public Repository repo;
	@GetMapping("/")
	public String testMethod() {
		List<Product> productList = repo.findAll();
		for(Product prod: productList) {
			System.out.println(prod.objID);
			System.out.println(prod.name);
			
		}
		return "Hello";
	}
	
	
}
