package com.agencia.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.model.entity.Cliente;


@Repository
public interface clienteRepository extends JpaRepository<Cliente, Long> {
    //query methods
		boolean existsByEmail(String email);
		
		Optional<Cliente> findByid(String email);
		
	}