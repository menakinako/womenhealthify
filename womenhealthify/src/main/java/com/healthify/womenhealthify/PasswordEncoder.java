package com.healthify.womenhealthify;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

    public static void main(String[] args){
        BCryptPasswordEncoder  encoder = new BCryptPasswordEncoder();
        String rawPassword = "alex2035";
        String encodePassword = encoder.encode(rawPassword);

        System.out.println(encodePassword);
    }
    
}
