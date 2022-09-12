package com.flight.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.flight.service.entity.BookingEntity;

public interface BookingRepository extends CrudRepository<BookingEntity, Long>{

}
