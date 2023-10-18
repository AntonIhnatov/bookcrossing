package com.example.demo.dto;

import java.util.Set;

public class UserDTO {
    private Long id;
    private String login;
    private String name;
    private String email;
    private String phone;
    private String city;
    private Set<String> roles; // Используйте Set<String> для хранения ролей в виде строк

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
