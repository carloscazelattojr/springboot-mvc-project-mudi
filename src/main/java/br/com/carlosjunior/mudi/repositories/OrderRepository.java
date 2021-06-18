package br.com.carlosjunior.mudi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carlosjunior.mudi.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}
