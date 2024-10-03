package model;

import org.testng.annotations.Test;

import java.util.Random;

public class UserModel {
    public String email;
    public String password;

    public UserModel(String email, String password) {

        this.email = email;
        this.password = password;
    }
}

