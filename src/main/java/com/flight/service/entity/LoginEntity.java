package com.flight.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {
	@Id
    private Integer username;
    private String password;

    public LoginEntity() {
    }

    public LoginEntity(Integer username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "username=" + username +
                ", password='" + password + '\'' +
                '}';
    }
}
