package com.devstack.lms.registrationserviceapi.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "registration")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date registerDate;
    private Long studentId;
    private String programId;
    private String intake;
    private boolean verified;
}
