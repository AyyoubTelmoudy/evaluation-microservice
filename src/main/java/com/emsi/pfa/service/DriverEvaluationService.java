package com.emsi.pfa.service;

import com.emsi.pfa.request.CommentRequest;
import com.emsi.pfa.request.MarkRequest;
import com.emsi.pfa.dto.CommentDTO;
import com.emsi.pfa.dto.DriverEvaluationDTO;
import com.emsi.pfa.dto.MarkDTO;

public interface DriverEvaluationService {

    DriverEvaluationDTO getDriverEvaluation(String driverPublicId);

    CommentDTO commentDriver(CommentRequest commentRequest);
    MarkDTO markDriver(MarkRequest markRequest);
}
