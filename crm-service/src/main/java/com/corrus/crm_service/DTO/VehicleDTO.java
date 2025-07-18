package com.corrus.crm_service.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class VehicleDTO {

    private int totalCount;

    private int availableCount;

    private String description;

    private BigDecimal price;

    private String brand;

    private String model;

    private String producerCountry;
}
