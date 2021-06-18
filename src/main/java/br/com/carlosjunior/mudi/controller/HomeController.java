package br.com.carlosjunior.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.carlosjunior.mudi.model.Order;
import br.com.carlosjunior.mudi.repositories.OrderRepository;

@Controller
public class HomeController {

	@Autowired
	private OrderRepository orderRepository; 
	
	@GetMapping
	public String homeMain() {
		return  "redirect:/home";
	}
	
	
	@GetMapping("/home")
	public String home(Model model ) {

		List<Order> orders = orderRepository.findAll();
		model.addAttribute("orders", orders);
		
		return "home";
	}

}
