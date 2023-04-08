package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.Car;

@Repository
public interface CarRepo  extends JpaRepository<Car,Integer>{

}

