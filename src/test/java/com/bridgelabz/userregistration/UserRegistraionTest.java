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

    /*      @Test
            public void firstName_WhenTrue() {
                boolean result = user.userFirstName("Nikhil");
                Assertions.assertEquals(true, result);
            }

            @Test
            public void firstName_WhenFalse() {
                boolean result = user.userFirstName("Ni");
                Assertions.assertEquals(false, result);
            }

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

            @Test
            public void email_WhenTrue() {
                boolean result = user.userEmail("nikhil@gmail.com");
                Assertions.assertEquals(true, result);
            }

            @Test
            public void email_WhenFalse() {
                boolean result = user.userEmail("nikhil@abc@gmail.com");
                Assertions.assertEquals(false, result);
            }
     */

    @Test
    public void mobileNumber_WhenTrue() {
        boolean result = user.userMobileNumber("91 9503800272");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void mobileNumber_WhenFalse() {
        boolean result = user.userMobileNumber("919823702856");
        Assertions.assertEquals(false, result);
    }

}
