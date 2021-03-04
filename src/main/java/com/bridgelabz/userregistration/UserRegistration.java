package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,14}$";
    private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,13}$";
    private static final String EMAIL = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]{2,}){1,2}$";
    private static final String MOBILE_NUMBER = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    public boolean userFirstName(String firstName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(firstName);
        if(!Pattern.matches(FIRST_NAME, firstName)) {
            throw new UserRegistrationException("Invalid First Name");
        }
        return true;
    }


    public boolean userLastName(String lastName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(lastName);
        if(!Pattern.matches(LAST_NAME, lastName)) {
            throw new UserRegistrationException("Invalid Last Name");
        }
        return true;
    }

    public boolean userEmail(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(email);
        if(!Pattern.matches(EMAIL, email)) {
            throw new UserRegistrationException("Invalid Email");
        }
        return true;
    }

    public boolean userMobileNumber(String mobileNumber) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER);
        if(!Pattern.matches(MOBILE_NUMBER, mobileNumber)) {
            throw new UserRegistrationException("Invalid Mobile Number");
        }
        return true;
    }

    public boolean userPassword(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(PASSWORD);
        if(!Pattern.matches(PASSWORD, password)) {
            throw new UserRegistrationException("Invalid Password");
        }
        return true;
    }

}
