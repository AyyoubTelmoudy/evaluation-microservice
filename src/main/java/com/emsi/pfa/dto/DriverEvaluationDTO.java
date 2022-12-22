package com.emsi.pfa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverEvaluationDTO {
    private String publicId;
    private int evaluation;
    private String comment;
    private String driverPublicId;
    private String passengerPublicId;
}
