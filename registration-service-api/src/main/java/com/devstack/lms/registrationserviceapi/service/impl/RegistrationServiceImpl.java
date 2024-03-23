package com.devstack.lms.registrationserviceapi.service.impl;

import com.devstack.lms.registrationserviceapi.dto.request.RequestRegistrationDto;
import com.devstack.lms.registrationserviceapi.entity.Registration;
import com.devstack.lms.registrationserviceapi.repository.RegistrationRepository;
import com.devstack.lms.registrationserviceapi.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {
    private final RegistrationRepository repository;

    @Override
    public void registerStudent(RequestRegistrationDto dto) {
        Registration registration
                = Registration.builder()
                .registerDate(dto.getRegisterDate())
                .studentId(dto.getStudentId())
                .programId(dto.getProgramId())
                .intake(dto.getIntake())
                .build();
        repository.save(registration);
    }
}
