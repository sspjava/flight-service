package com.flight.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.flight.service.entity.PassengerEntity;

public interface PassengersRepository extends CrudRepository<PassengerEntity, Integer>{

}
