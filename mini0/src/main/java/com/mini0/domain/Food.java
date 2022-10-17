package com.mini0.domain;


import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;






@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Food {
	
	@Id 
	@GeneratedValue
	@Column(name = "food_Id")
	public Long id;
	
	@Column(name = "food_name")
	private String name;
	
	@Column(name = "food_price")
	private int price;
	
	

	
	
}
