package com.mia.gov.az.tagim.Controller;

import com.mia.gov.az.tagim.Dto.AuthenticationDto;
import com.mia.gov.az.tagim.Dto.JwtResponseDto;
import com.mia.gov.az.tagim.Repository.RoleRepository;
import com.mia.gov.az.tagim.Repository.UserRepository;
import com.mia.gov.az.tagim.Security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController{

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/login")
    public ResponseEntity<JwtResponseDto> getToken(@RequestBody AuthenticationDto registerDto) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(registerDto.getUsername(), registerDto.getPassword()));

        String jwt = jwtUtils.generateJwtToken(authentication);

        JwtResponseDto jwtResponseDto = new JwtResponseDto(jwt);
        return ResponseEntity.ok(jwtResponseDto);
    }
}
