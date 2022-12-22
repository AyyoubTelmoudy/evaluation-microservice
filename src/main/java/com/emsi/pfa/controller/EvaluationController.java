package com.emsi.pfa.controller;

import com.emsi.pfa.Request.EvaluationRequest;
import com.emsi.pfa.dto.DriverEvaluationDTO;
import com.emsi.pfa.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class EvaluationController {

    @Autowired
    EvaluationService evaluationService;

    @PostMapping(value = "/drivers/evaluations")
    public DriverEvaluationDTO evaluateDriver(@RequestBody EvaluationRequest evaluationRequest)
    {
       return evaluationService.addEvaluationToDriver(evaluationRequest);
    }

    @GetMapping(value = "/drivers/{driverPublicId}/evaluations")
    public List<DriverEvaluationDTO> getDriverEvaluation(@PathVariable(name = "driverPublicId") String driverPublicId)
    {
        return  evaluationService.getDriverEvaluations(driverPublicId);
    }

}
