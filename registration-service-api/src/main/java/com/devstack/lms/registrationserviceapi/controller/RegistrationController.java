package com.devstack.lms.registrationserviceapi.controller;

import com.devstack.lms.registrationserviceapi.dto.request.RequestRegistrationDto;
import com.devstack.lms.registrationserviceapi.service.RegistrationService;
import com.devstack.lms.registrationserviceapi.util.StandardResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/registrations")
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping
    private ResponseEntity<StandardResponse> registerStudent(@RequestBody RequestRegistrationDto requestSubjectDto) {
        registrationService.registerStudent(requestSubjectDto);
        return new ResponseEntity<>(
                new StandardResponse(201, "Student was Registered!",
                        requestSubjectDto.getStudentId()),
                HttpStatus.CREATED
        );
    }
}
