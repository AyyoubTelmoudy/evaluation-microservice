package com.emsi.pfa.mapper;

import com.emsi.pfa.dto.CommentDTO;
import com.emsi.pfa.dto.DriverEvaluationDTO;
import com.emsi.pfa.dto.MarkDTO;
import com.emsi.pfa.entity.Comment;
import com.emsi.pfa.entity.DriverEvaluation;
import com.emsi.pfa.entity.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DriverEvaluationMapper {
    @Autowired
    MarkMapper markMapper;
    @Autowired
    CommentMapper commentMapper;

   public DriverEvaluationDTO toDriverEvaluationDTO(DriverEvaluation evaluation)
   {
       DriverEvaluationDTO driverEvaluationDTO=new DriverEvaluationDTO();
       driverEvaluationDTO.setDriverPublicId(evaluation.getDriverPublicId());
       driverEvaluationDTO.setPublicId(evaluation.getPublicId());
       List<MarkDTO> markDTOS=new ArrayList<MarkDTO>();
       List<CommentDTO> commentDTOS=new ArrayList<CommentDTO>();
       for (Comment comment:evaluation.getComments())
       {
         commentDTOS.add(commentMapper.toCommentDTO(comment));
       }
       driverEvaluationDTO.setComments(commentDTOS);
       for (Mark mark:evaluation.getMarks())
       {
        markDTOS.add(markMapper.toMarkDTO(mark));
       }
       driverEvaluationDTO.setMarks(markDTOS);
       return  driverEvaluationDTO;
   }

}
