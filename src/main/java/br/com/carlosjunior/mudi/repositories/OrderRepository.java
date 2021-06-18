package br.com.carlosjunior.mudi.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.carlosjunior.mudi.model.Order;

@Repository
public class OrderRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Order> findAllOrders() {
		Query query = entityManager.createQuery("select o from Order o", Order.class);
		return query.getResultList();
	}
}
