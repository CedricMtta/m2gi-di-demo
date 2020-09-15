package com.cedricmtta.didemo.service;

import com.cedricmtta.didemo.dto.UserPreferenceDto;
import com.cedricmtta.didemo.mapper.UserPreferenceMapper;
import com.cedricmtta.didemo.repository.UserPreferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserPreferenceServiceImpl implements UserPreferenceService {
    private final UserPreferenceRepository userPreferenceRepository;
    private final UserPreferenceMapper userPreferenceMapper;

    public UserPreferenceServiceImpl(UserPreferenceRepository userPreferenceRepository,
                                 UserPreferenceMapper userPreferenceMapper) {
        this.userPreferenceRepository = userPreferenceRepository;
        this.userPreferenceMapper = userPreferenceMapper;
    }

    @Override
    public List<UserPreferenceDto> findAll() {
        return userPreferenceRepository.findAll()
                .stream()
                .map(userPreferenceMapper::toDto)
                .collect(Collectors.toList());
    }
}
