package com.emsi.pfa.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluationRequest {
    private int evaluation;
    private String comment;
    private String driverPublicId;
    private String passengerPublicId;
}
