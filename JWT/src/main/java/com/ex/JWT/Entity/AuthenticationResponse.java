package com.ex.JWT.Entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
public class AuthenticationResponse {
    private String token ;

    public AuthenticationResponse(String token) {
        this.token = token;
    }
}
