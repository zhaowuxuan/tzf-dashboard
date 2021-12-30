package com.tzf.dashboard.modules.ums.service.impl;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class test {
    public static PasswordEncoder passwordEncoder;
    public static void main(String[] args) {
        String encodePassword = new BCryptPasswordEncoder().encode("123456");
        System.out.println(encodePassword);

    }
}
