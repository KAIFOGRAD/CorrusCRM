package com.corrus.crm_service.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.corrus.crm_service.entity.Vehicle;
import com.corrus.crm_service.service.UserService;

@RestController
@RequestMapping("/user/v1/vehicles")
@RequiredArgsConstructor
public class UserController {
    private final UserService UserService;

    @GetMapping("/all")
    public List<Vehicle> getAllVehicle()
    {
        return UserService.getAllVehicle();
    }

    
}
