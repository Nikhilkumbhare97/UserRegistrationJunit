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
    public void firstName_WhenTrue() {
        boolean result = user.userFirstName("Nikhil");
        Assert.assertEquals(true, result);
    }

    @Test
    public void firstName_WhenFalse() {
        boolean result = user.userFirstName("Ni");
        Assert.assertEquals(false, result);
    }

    @Test
    public void lastName_WhenTrue() {
        boolean result = user.userLastName("Kumbhare");
        Assert.assertEquals(true, result);
    }

    @Test
    public void lastName_WhenFalse() {
        boolean result = user.userLastName("kumbhare");
        Assert.assertEquals(false, result);
    }

    @Test
    public void email_WhenTrue() {
        boolean result = user.userEmail("nikhil@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void email_WhenFalse() {
        boolean result = user.userEmail("nikhil@abc@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void mobileNumber_WhenTrue() {
        boolean result = user.userMobileNumber("91 9503800272");
        Assert.assertEquals(true, result);
    }

    @Test
    public void mobileNumber_WhenFalse() {
        boolean result = user.userMobileNumber("919823702856");
        Assert.assertEquals(false, result);
    }

    @Test
    public void password_WhenTrue() {
        boolean result = user.userPassword("Nikhil97@");
        Assert.assertEquals(true, result);
    }

    @Test
    public void password_WhenFalse() {
        boolean result = user.userPassword("nnikhil@@");
        Assert.assertEquals(false, result);
    }

}