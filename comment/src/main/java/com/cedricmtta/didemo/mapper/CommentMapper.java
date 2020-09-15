package com.cedricmtta.didemo.mapper;

import com.cedricmtta.didemo.dto.CommentDto;
import com.cedricmtta.didemo.entity.CommentEntity;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    public CommentDto toDto(CommentEntity entity) {
        return CommentDto.builder()
                .id(entity.getId())
                .build();
    }
}
