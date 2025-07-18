package com.corrus.crm_service.DTO;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class VehicleDTO {
    private Long id;

    private int totalCount;

    private int availableCount;

    private String description;

    private BigDecimal price;

    private String brand;

    private String model;

    private String producerCountry;
}
