package com.corrus.crm_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corrus.crm_service.Entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

}
