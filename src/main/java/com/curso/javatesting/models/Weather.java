package com.curso.javatesting.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    private String status;
    private Integer minTemp;
    private Integer maxTemp;
}
