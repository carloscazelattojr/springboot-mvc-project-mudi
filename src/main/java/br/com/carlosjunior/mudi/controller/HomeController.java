package br.com.carlosjunior.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.carlosjunior.mudi.model.Order;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model ) {

		Order order = new Order();

		order.setProductName("Xiaomi Redmi Note 10");
		order.setUrlImage("https://images-na.ssl-images-amazon.com/images/I/51l-v1x5mTL._AC_SL1000_.jpg");
		order.setUrlProduct(
				"https://www.amazon.com.br/Xiaomi-Redmi-128GB-Vers%C3%A3o-global/dp/B08ZMB9KFF?ref_=Oct_s9_apbd_otopr_hd_bw_bHjJLCl&pf_rd_r=B43S9XVVE6JX3GE5GT6T&pf_rd_p=1da659a0-948a-52ba-a216-243433981446&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=16243803011");
		order.setDescription("Uma descricao qualquer do produto");

		List<Order> orders = Arrays.asList(order, order, order);
		model.addAttribute("orders", orders);
		
		return "home";
	}

}
