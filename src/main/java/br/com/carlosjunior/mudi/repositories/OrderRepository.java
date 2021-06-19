package br.com.carlosjunior.mudi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carlosjunior.mudi.model.Order;
import br.com.carlosjunior.mudi.model.StatusOrder;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findByStatus(StatusOrder status);


}
