package com.devstack.lms.registrationserviceapi.repository;

import com.devstack.lms.registrationserviceapi.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
