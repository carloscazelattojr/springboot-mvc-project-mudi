package br.com.carlosjunior.mudi.Dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import br.com.carlosjunior.mudi.model.Order;



public class OrderDto {

	@NotBlank
	private String productName;
	
	@NotBlank
	private String urlProduct;
	
	@NotBlank
	private String urlImage;

	private String description;
	private BigDecimal productValue;
	private LocalDate dateDelivery;

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductValue() {
		return productValue;
	}

	public void setProductValue(BigDecimal productValue) {
		this.productValue = productValue;
	}

	public LocalDate getDateDelivery() {
		return dateDelivery;
	}

	public void setDateDelivery(LocalDate dateDelivery) {
		this.dateDelivery = dateDelivery;
	}

	public String getUrlProduct() {
		return urlProduct;
	}

	public void setUrlProduct(String urlProduct) {
		this.urlProduct = urlProduct;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Order toOrder() {
		Order order = new Order();
		order.setDescription(description);
		//order.setDateDelivery(dateDelivery);
		//order.setProductValue(productValue);
		order.setProductName(productName);
		order.setUrlImage(urlImage);
		order.setUrlProduct(urlProduct);
		
		return order;
	}

}
