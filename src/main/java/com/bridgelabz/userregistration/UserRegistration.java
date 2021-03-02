package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    //private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,14}$";
    //private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,13}$";
    private static final String EMAIL = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /* public static boolean userFirstName(String firstName) {
                Pattern pattern = Pattern.compile(FIRST_NAME);
                return pattern.matcher(firstName).matches();
            }


        public static boolean userLastName(String lastName) {
            Pattern pattern = Pattern.compile(LAST_NAME);
            return pattern.matcher(lastName).matches();
        }
    */

    public static boolean userEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL);
        return pattern.matcher(email).matches();
    }
}
