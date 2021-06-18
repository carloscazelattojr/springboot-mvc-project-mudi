package br.com.carlosjunior.mudi.Dto;

import javax.validation.constraints.NotBlank;

import br.com.carlosjunior.mudi.model.Order;
import br.com.carlosjunior.mudi.model.StatusOrder;

public class OrderDto {

	@NotBlank 
	private String productName;

	@NotBlank
	private String urlProduct;

	@NotBlank
	private String urlImage;

	private String description;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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
		order.setProductName(productName);
		order.setUrlImage(urlImage);
		order.setUrlProduct(urlProduct);
		order.setStatus(StatusOrder.AGUARDANDO);

		return order;
	}

}
