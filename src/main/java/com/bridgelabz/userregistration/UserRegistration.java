package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,14}$";

    public static boolean userFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME);
        return pattern.matcher(firstName).matches();
    }

}
