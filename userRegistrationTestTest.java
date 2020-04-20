package userRegistration;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class userRegistrationTestTest {
    @Test
    public void ValidateFirstName() {
        UserRegistration registration = new UserRegistration();
        assertEquals(true, registration.toValidateFirstName("Amit"));
    }

    @Test
    public void validateLastName() {
        UserRegistration registration = new UserRegistration();
        assertEquals(true, registration.toValidateLastName("Swaraj"));

    }

    @Test
    public void validateEmail() {
        UserRegistration registration = new UserRegistration();
        assertEquals(true, registration.toValidateEmails("abc.xyz@yahoo.co.in"));

    }

    @Test
    public void validatePhone() {
        UserRegistration registration = new UserRegistration();
        assertEquals(true, registration.toValidatePhone("91 9019123456"));
    }

    @Test
    public void validatePassword()
    {
        UserRegistration registration=new UserRegistration();
        assertEquals(true,registration.toValidatePassword("Wrer@133"));
    }

}
