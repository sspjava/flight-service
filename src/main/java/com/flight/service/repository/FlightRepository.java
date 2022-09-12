package com.flight.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.service.entity.FlightEntity;

public interface FlightRepository extends JpaRepository<FlightEntity, Long>{

}
