package com.corrus.crm_service.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corrus.crm_service.dto.VehicleDTO;
import com.corrus.crm_service.service.AdminService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("admin/v1/Vehicles")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @PostMapping
    public VehicleDTO createVehicle(@RequestBody VehicleDTO vehicleDTO)
    {
        return adminService.createVehicle(vehicleDTO);
    }

    @PutMapping("/{id}")
    public VehicleDTO updateVehicle(@PathVariable long id, @RequestBody VehicleDTO vehicleDTO)
    {
        return adminService.updateVehicle(id, vehicleDTO);
    }

    @DeleteMapping("/{id}")
    public VehicleDTO deleteVehicle(@PathVariable long id)
    {
        return adminService.deleteVehicle(id);
    }

}
