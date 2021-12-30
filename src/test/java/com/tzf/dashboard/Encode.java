package com.tzf.dashboard;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encode {
    public static void main(String[] args) {
        // springsecurity 注册加密方法
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);
        //$2a$10$H2HTe3SVdKMk8ewC3gRKouva7U6DAQspHqyhcdg805JGHAApV1Wci
        //$2a$10$Iz4Y52GmirUf5SRW6jTIA.0cgaS0mKTYZVN2cFFeK8DXk9YHVhJDW

        // springsecurity 登录加密方法
        BCrypt bCrypt = new BCrypt();
        String hashpw = bCrypt.hashpw("123456", "$2a$10$0sTdUqL6WJxfPVy3dY.Q0.L3fFpOwml3Cm9sud6O.1e6Q84/UnSxe");
        System.out.println(hashpw);
    }
}
