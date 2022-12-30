package com.emsi.pfa.mapper;


import com.emsi.pfa.dto.CommentDTO;
import com.emsi.pfa.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    public CommentDTO toCommentDTO(Comment comment)
    {
        CommentDTO commentDTO=new CommentDTO();
        commentDTO.setComment(comment.getComment());
        commentDTO.setPublicId(comment.getPublicId());
        commentDTO.setPassengerPublicId(comment.getPassengerPublicId());
        return commentDTO;
    }
}
