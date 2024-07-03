package com.ex.JWT.Controller;

import com.ex.JWT.Entity.AuthenticationResponse;
import com.ex.JWT.Entity.User;
import com.ex.JWT.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse>register(@RequestBody User request){
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse>login(@RequestBody User request){
        return ResponseEntity.ok(authService.authenticate(request));
    }
}
