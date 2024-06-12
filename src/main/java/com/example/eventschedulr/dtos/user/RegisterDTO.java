package com.example.eventschedulr.dtos.user;

import com.example.eventschedulr.entities.user.UserRole;

public record RegisterDTO(String login, String password, UserRole Role) { }