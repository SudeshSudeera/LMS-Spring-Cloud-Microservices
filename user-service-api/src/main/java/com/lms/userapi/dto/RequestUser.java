package com.lms.userapi.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestUser {
    private String username;
    private String password;
}
