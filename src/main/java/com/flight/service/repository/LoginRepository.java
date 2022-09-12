package com.flight.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.service.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Integer>{
	LoginEntity findByUsernameAndPassword(Integer username, String password);
}
