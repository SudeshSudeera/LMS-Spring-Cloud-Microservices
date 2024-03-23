package com.devstack.lms.registrationserviceapi.service;

import com.devstack.lms.registrationserviceapi.dto.request.RequestRegistrationDto;

public interface RegistrationService {
    public void registerStudent(RequestRegistrationDto dto);
}
