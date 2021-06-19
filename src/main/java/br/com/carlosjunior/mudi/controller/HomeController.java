package br.com.carlosjunior.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.carlosjunior.mudi.model.Order;
import br.com.carlosjunior.mudi.model.StatusOrder;
import br.com.carlosjunior.mudi.repositories.OrderRepository;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping
	public String homeMain() {
		return "redirect:/home";
	}

	@GetMapping("/home")
	public String home(Model model) {
		List<Order> orders = orderRepository.findAll();
		model.addAttribute("orders", orders);
		return "home";
	}

	@GetMapping("/home/{status}")
	public String homeStatusOrders(@PathVariable("status") String status, Model model) {

		List<Order> orders = orderRepository.findByStatus(StatusOrder.valueOf(status.toUpperCase()));
		model.addAttribute("orders", orders);
		model.addAttribute("status", status);

		return "home";
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}

}
