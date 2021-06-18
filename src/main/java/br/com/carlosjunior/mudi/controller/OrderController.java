package br.com.carlosjunior.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.carlosjunior.mudi.Dto.OrderDto;
import br.com.carlosjunior.mudi.model.Order;
import br.com.carlosjunior.mudi.repositories.OrderRepository;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping("/form")
	public String formulary() {
		return "order/formulary";
	}

	@PostMapping("/new")
	public String newOrder(@Valid OrderDto newOrder, BindingResult result) {

		if (result.hasErrors()) {
			return "order/formulary";
		}

		Order order = newOrder.toOrder();
		orderRepository.save(order);
		return "/home";
	}

}
