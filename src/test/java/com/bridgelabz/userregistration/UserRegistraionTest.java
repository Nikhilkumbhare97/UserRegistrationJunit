package com.bridgelabz.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistraionTest {

    UserRegistration user;

    @BeforeEach
    public void setup() {
        user = new UserRegistration();
    }

    /*    @Test
        public void firstName_WhenTrue() {
            boolean result = user.userFirstName("Nikhil");
            Assertions.assertEquals(true, result);

        }

        @Test
        public void firstName_WhenFalse() {
            boolean result = user.userFirstName("Ni");
            Assertions.assertEquals(false, result);
        }
    */
    @Test
    public void lastName_WhenTrue() {
        boolean result = user.userLastName("Kumbhare");
        Assertions.assertEquals(true, result);

    }

    @Test
    public void lastName_WhenFalse() {
        boolean result = user.userLastName("kumbhare");
        Assertions.assertEquals(false, result);
    }
}
