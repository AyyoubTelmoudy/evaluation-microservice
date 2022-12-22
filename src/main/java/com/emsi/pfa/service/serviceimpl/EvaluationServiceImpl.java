package com.emsi.pfa.service.serviceimpl;

import com.emsi.pfa.Request.EvaluationRequest;
import com.emsi.pfa.dto.DriverEvaluationDTO;
import com.emsi.pfa.entity.Evaluation;
import com.emsi.pfa.mapper.EvaluationMapper;
import com.emsi.pfa.repository.EvaluationRepository;
import com.emsi.pfa.service.EvaluationService;
import com.emsi.pfa.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvaluationServiceImpl implements EvaluationService {

    @Autowired
    EvaluationRepository evaluationRepository;
    @Autowired
    EvaluationMapper evaluationMapper;
    @Override
    public DriverEvaluationDTO addEvaluationToDriver(EvaluationRequest evaluationRequest) {
        Evaluation evaluation=new Evaluation();
        evaluation.setPublicId(Utils.genereteRandomString(30));
        evaluation.setEvaluation(evaluationRequest.getEvaluation());
        evaluation.setComment(evaluationRequest.getComment());
        evaluation.setDriverPublicId(evaluationRequest.getDriverPublicId());
        evaluation.setPassengerPublicId(evaluationRequest.getPassengerPublicId());
        evaluation=evaluationRepository.save(evaluation);
        return evaluationMapper.toDriverEvaluationDTO(evaluation);
    }

    @Override
    public List<DriverEvaluationDTO> getDriverEvaluations(String driverPublicId) {
        List<Evaluation> evaluations=evaluationRepository.findByDriverPublicId(driverPublicId);
        List<DriverEvaluationDTO> driverEvaluationDTOS=new ArrayList<DriverEvaluationDTO>();
        for (Evaluation evaluation:evaluations)
        {
          DriverEvaluationDTO driverEvaluationDTO=evaluationMapper.toDriverEvaluationDTO(evaluation);
           driverEvaluationDTOS.add(driverEvaluationDTO);
        }
        return driverEvaluationDTOS;
    }
}
