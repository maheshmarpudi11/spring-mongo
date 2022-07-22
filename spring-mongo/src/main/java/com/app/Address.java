package com.app;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Address")
public class Address {
	
	private Integer id;
	private String state;
	private String city;
	private String street;
	

}
