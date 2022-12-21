package com.emsi.pfa.controller;

import com.emsi.pfa.Request.EvaluationRequest;
import com.emsi.pfa.dto.DriverEvaluationDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class EvaluationController {

    @PostMapping(value = "/drivers/evaluations")
    public void evaluateDriver(@RequestBody EvaluationRequest evaluationRequest)
    {

    }

    @GetMapping(value = "/drivers/{publicId}/evaluations")
    public List<DriverEvaluationDTO> getDriverEvaluation(@PathVariable(name = "publicId") String driverId)
    {
        return  new ArrayList<DriverEvaluationDTO>();
    }

}
