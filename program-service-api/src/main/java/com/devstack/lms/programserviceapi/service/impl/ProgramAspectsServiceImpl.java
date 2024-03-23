package com.devstack.lms.programserviceapi.service.impl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class ProgramAspectsServiceImpl {
    private final WebClient webClient;
    int count;
    @CircuitBreaker(name="subjectService", fallbackMethod = "fallBackMethod")
    public Boolean checkSubjects(String ids) {
        return webClient.get().uri("http://localhost:8082/api/v1/subjects/{id}",ids)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();
    }

    public Boolean fallBackMethod(String ids, Exception e) {
        return  false;
    }
}
