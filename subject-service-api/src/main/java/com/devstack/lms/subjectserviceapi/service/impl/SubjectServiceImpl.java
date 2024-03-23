package com.devstack.lms.subjectserviceapi.service.impl;

import com.devstack.lms.subjectserviceapi.dto.request.RequestSubjectDto;
import com.devstack.lms.subjectserviceapi.dto.response.ResponseSubjectDto;
import com.devstack.lms.subjectserviceapi.entity.Subject;
import com.devstack.lms.subjectserviceapi.repository.SubjectRepository;
import com.devstack.lms.subjectserviceapi.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;

    @Override
    public void createSubject(RequestSubjectDto dto) {
        Subject subject = Subject.builder()
                .name(dto.getName())
                .status(dto.isStatus()).build();
        subjectRepository.save(subject);
    }

    public boolean isListAvailable(List<Long> ids) {
        for (Subject sub:subjectRepository.findByIdIn(ids)) {
            if(!sub.isStatus()){
                return false;
            }
        }
        return true;
    }

    @Override
    public List<ResponseSubjectDto> findAll() {
        List<Subject> all = subjectRepository.findAll();
        List<ResponseSubjectDto> dtos = new ArrayList<>();
        for (Subject sub: all) {
            dtos.add(new ResponseSubjectDto(sub.getId(), sub.getName(),sub.isStatus()));
        }
        return dtos;
    }
}
