package com.devstack.lms.registrationserviceapi.dto.request;

import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestRegistrationDto {
    private Date registerDate;
    private Long studentId;
    private String programId;
    private String intake;
}
