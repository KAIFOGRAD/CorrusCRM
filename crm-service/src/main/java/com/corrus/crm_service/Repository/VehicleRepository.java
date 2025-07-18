package com.corrus.crm_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corrus.crm_service.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    
}
