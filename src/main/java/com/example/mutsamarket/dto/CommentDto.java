package com.example.mutsamarket.dto;

import com.example.mutsamarket.entity.CommentEntity;
import lombok.Data;

@Data
public class CommentDto {
    private Long id;
    private String content;
    private String reply;

    public static CommentDto fromEntity(CommentEntity commentEntity) {
        CommentDto commentDto = new CommentDto();

        commentDto.setId(commentEntity.getId());
        commentDto.setContent(commentEntity.getContent());
        commentDto.setReply(commentEntity.getReply());

        return commentDto;
    }
}
