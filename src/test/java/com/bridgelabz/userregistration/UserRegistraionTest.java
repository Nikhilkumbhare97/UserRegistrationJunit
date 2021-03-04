package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistraionTest {

    UserRegistration user;

    @Before
    public void setup() {
        user = new UserRegistration();
    }

    @Test
    public void firstName_WhenTrue() throws UserRegistrationException {
        boolean result = user.userFirstName("Nikhil");
        Assert.assertEquals(true, result);
    }

    @Test
    public void firstName_WhenFalse() throws UserRegistrationException {
        try {
            boolean result = user.userFirstName("Ni");
            Assert.assertEquals(false, result);
        }catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid First Name", e.getMessage());
        }
    }

    @Test
    public void lastName_WhenTrue() throws UserRegistrationException {
        boolean result = user.userLastName("Kumbhare");
        Assert.assertEquals(true, result);
    }

    @Test
    public void lastName_WhenFalse() throws UserRegistrationException {
        try {
            boolean result = user.userLastName("kumbhare");
            Assert.assertEquals(false, result);
        }catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Last Name", e.getMessage());
        }
    }

    @Test
    public void email_WhenTrue() throws UserRegistrationException {
        boolean result = user.userEmail("nikhil@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void email_WhenFalse() throws UserRegistrationException {
        try {
            boolean result = user.userEmail("nikhil@abc@gmail.com");
            Assert.assertEquals(false, result);
        }catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Email", e.getMessage());

        }
    }

    @Test
    public void mobileNumber_WhenTrue() throws UserRegistrationException {
        boolean result = user.userMobileNumber("91 9503800272");
        Assert.assertEquals(true, result);
    }

    @Test
    public void mobileNumber_WhenFalse() throws UserRegistrationException {
        try {
            boolean result = user.userMobileNumber("919823702856");
            Assert.assertEquals(false, result);
        }catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Mobile Number", e.getMessage());
        }
    }

    @Test
    public void password_WhenTrue() throws UserRegistrationException {
        boolean result = user.userPassword("Nikhil97@");
        Assert.assertEquals(true, result);
    }

    @Test
    public void password_WhenFalse() throws UserRegistrationException {
        try {
            boolean result = user.userPassword("nnikhil@@");
            Assert.assertEquals(false, result);
        }catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Password", e.getMessage());
        }
    }
}