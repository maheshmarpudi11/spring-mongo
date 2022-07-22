package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.repository.BookStoreRepository;

@RestController
@RequestMapping("/order-service")
public class BookStoreController {

	@Autowired
	private BookStoreRepository repository;

	@PostMapping("/placeOrderNow")
	public String placeOrder(@RequestBody User user) {
		repository.save(user);
		return "order placed sucessfully..";
	}
	
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable("name") String name){
		return repository.findByName(name);
	}
	
	@GetMapping("/getUserByAddress/{city}")
	public List<User> getUserByCity(@PathVariable("city") String city){
		return repository.findByCity(city);
	}
	
	@GetMapping("/getAllRecords")
	public List<User> getAllRecords(){
		return repository.findAll();
	}

}
