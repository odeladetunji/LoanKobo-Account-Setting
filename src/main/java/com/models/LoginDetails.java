package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoginDetails {
    @JsonProperty("Email")
    public String email;
    @JsonProperty("Password")
    public String password;

    public LoginDetails(){}
}








































