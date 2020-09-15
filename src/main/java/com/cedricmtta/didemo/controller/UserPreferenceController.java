package com.cedricmtta.didemo.controller;

import com.cedricmtta.didemo.dto.UserPreferenceDto;
import com.cedricmtta.didemo.service.UserPreferenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-pref")
public class UserPreferenceController {
    private final UserPreferenceService userPreferenceService;

    public UserPreferenceController(UserPreferenceService userPreferenceService) {
        this.userPreferenceService = userPreferenceService;
    }

    @GetMapping
    public List<UserPreferenceDto> findAll() {
        return userPreferenceService.findAll();
    }
}
