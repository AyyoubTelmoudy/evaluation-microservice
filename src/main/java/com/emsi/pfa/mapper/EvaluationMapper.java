package com.emsi.pfa.mapper;

import com.emsi.pfa.dto.DriverEvaluationDTO;
import com.emsi.pfa.entity.Evaluation;
import org.springframework.stereotype.Component;

@Component
public class EvaluationMapper {
   public DriverEvaluationDTO toDriverEvaluationDTO(Evaluation evaluation)
   {
       DriverEvaluationDTO driverEvaluationDTO=new DriverEvaluationDTO();
       driverEvaluationDTO.setEvaluation(evaluation.getEvaluation());
       driverEvaluationDTO.setComment(evaluation.getComment());
       driverEvaluationDTO.setPublicId(evaluation.getPublicId());
       driverEvaluationDTO.setDriverPublicId(evaluation.getDriverPublicId());
       driverEvaluationDTO.setPassengerPublicId(evaluation.getPassengerPublicId());
       return  driverEvaluationDTO;
   }

}
