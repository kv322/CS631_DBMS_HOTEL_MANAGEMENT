package com.njit.cs631.dbms.repository;

import com.njit.cs631.dbms.model.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, String> {
    List<Hotel> findAll();
}
