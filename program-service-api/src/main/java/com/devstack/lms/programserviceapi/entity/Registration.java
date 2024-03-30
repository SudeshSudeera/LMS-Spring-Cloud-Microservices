package com.devstack.lms.programserviceapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document(value = "registration")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Registration {
    @Id
    private String id;
    private String email;
    private Program program;
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date date;
}
