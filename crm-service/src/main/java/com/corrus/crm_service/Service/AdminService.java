package com.corrus.crm_service.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.corrus.crm_service.dto.VehicleDTO;
import com.corrus.crm_service.entity.Vehicle;
import com.corrus.crm_service.repository.VehicleRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final VehicleRepository vehicleRepository;
    private final ModelMapper mapper;

    public VehicleDTO createVehicle(VehicleDTO vehicleCreateDTO)
    {
        Vehicle vehicle = mapper.map(vehicleCreateDTO, Vehicle.class);
        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        return mapper.map(savedVehicle,VehicleDTO.class);
    }

    public VehicleDTO updateVehicle(long id, VehicleDTO vehicleCreateDTO)
    {
        Vehicle vehicle = vehicleRepository.findById(id)
        .orElseThrow(()-> new EntityNotFoundException("Vehicle not found"));
        
        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        return mapper.map(savedVehicle, VehicleDTO.class); 
        
    }

    public VehicleDTO deleteVehicle(long id)
    {
        Vehicle vehicle = vehicleRepository.findById(id)
            .orElseThrow(()-> new EntityNotFoundException("Vehicle not found"));
        
        VehicleDTO deletedVehicle = mapper.map(vehicle,VehicleDTO.class);
        vehicleRepository.delete(vehicle);
        return deletedVehicle;
    }
    

}
