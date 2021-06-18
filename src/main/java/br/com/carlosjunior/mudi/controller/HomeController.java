package br.com.carlosjunior.mudi.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.carlosjunior.mudi.model.Order;

@Controller
public class HomeController {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@GetMapping("/home")
	public String home(Model model ) {

		Query query = entityManager.createQuery("select o from Order o", Order.class);
		List<Order> orders =  query.getResultList();

		model.addAttribute("orders", orders);
		
		return "home";
	}

}
