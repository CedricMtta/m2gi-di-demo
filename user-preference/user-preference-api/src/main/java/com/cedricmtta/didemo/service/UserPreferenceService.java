package com.cedricmtta.didemo.service;

import com.cedricmtta.didemo.dto.UserPreferenceDto;

import java.util.List;

public interface UserPreferenceService {
    List<UserPreferenceDto> findAll();
}
