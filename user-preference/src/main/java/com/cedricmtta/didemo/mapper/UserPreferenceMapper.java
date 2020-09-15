package com.cedricmtta.didemo.mapper;

import com.cedricmtta.didemo.dto.UserPreferenceDto;
import com.cedricmtta.didemo.entity.UserPreferenceEntity;
import org.springframework.stereotype.Component;

@Component
public class UserPreferenceMapper {
    public UserPreferenceDto toDto(UserPreferenceEntity entity) {
        return UserPreferenceDto.builder()
                .id(entity.getId())
                .build();
    }
}
