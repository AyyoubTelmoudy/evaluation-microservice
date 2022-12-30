package com.emsi.pfa.service;

import com.emsi.pfa.Request.CommentRequest;
import com.emsi.pfa.Request.MarkRequest;
import com.emsi.pfa.dto.CommentDTO;
import com.emsi.pfa.dto.DriverEvaluationDTO;
import com.emsi.pfa.dto.MarkDTO;

import java.util.List;

public interface DriverEvaluationService {

    DriverEvaluationDTO getDriverEvaluation(String driverPublicId);

    CommentDTO commentDriver(CommentRequest commentRequest);
    MarkDTO markDriver(MarkRequest markRequest);
}
