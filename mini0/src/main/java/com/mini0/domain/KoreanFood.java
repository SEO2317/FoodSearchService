package com.mini0.domain;


import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;






@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString

public class KoreanFood {
	
	@Id 
	@GeneratedValue
	@Column(name = "korean_food_Id")
	public Long id;
	
	@Column(name = "korean_food_name")
	private String name;
	
	@Column(name = "korean_food_price")
	private int price;
	
	@ManyToOne
	@JoinColumn(name = "food_Id")
	private Food food;
	
	

	
	
}
