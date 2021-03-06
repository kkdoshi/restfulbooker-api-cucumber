package com.restfulbooker.model;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class AuthPojo {

    /**
     * POJO classes improve readability and re-usability of a program
     */

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
