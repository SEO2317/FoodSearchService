package com.mini0.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mini0.domain.Food;

@RestController
public class FoodController {
	@GetMapping("/add")
	Food getFood(@RequestParam("food_Id") Long food_Id, @RequestParam("food_price") int food_price,
			@RequestParam("food_name") String food_name) {
		Food food = new Food();
		food.setId(food_Id);
		food.setName(food_name);
		food.setPrice(food_price);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mini0");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(food);
			tx.commit();

			Food food1 = em.find(Food.class, 1L);
			System.out.println(food1.toString());

		} catch (Exception e) {
			e.printStackTrace();

		}
		return food;
	}
}
