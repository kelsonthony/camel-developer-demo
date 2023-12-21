package com.kelsonthony.cameldeveloperdemo.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeatherDTO implements Serializable {
    
	private static final long serialVersionUID = 1L;
	
    private String city;
    private String temp;
    private String unit;
    private String receivedTime;
}
