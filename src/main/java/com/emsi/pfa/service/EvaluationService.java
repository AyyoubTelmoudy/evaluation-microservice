package com.emsi.pfa.service;

import com.emsi.pfa.Request.EvaluationRequest;
import com.emsi.pfa.dto.DriverEvaluationDTO;

import java.util.List;

public interface EvaluationService {
    DriverEvaluationDTO addEvaluationToDriver(EvaluationRequest evaluationRequest);

    List<DriverEvaluationDTO> getDriverEvaluations(String driverPublicId);
}
