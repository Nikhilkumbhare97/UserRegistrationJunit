package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    //private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,14}$";
    //private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,13}$";
    private static final String EMAIL = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    //private static final String MOBILE_NUMBER = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
    //private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

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

    /*  public static boolean userMobileNumber(String mobileNumber) {
            Pattern pattern = Pattern.compile(MOBILE_NUMBER);
            return pattern.matcher(mobileNumber).matches();
        }

        public static boolean userPassword(String password) {
            Pattern pattern = Pattern.compile(PASSWORD);
            return pattern.matcher(password).matches();
        }
     */
}
