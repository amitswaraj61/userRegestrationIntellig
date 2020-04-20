package userRegistration;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class userRegistrationTestTest {
    @Test
    public void ValidateFirstName()
    {
        UserRegistration registration=new UserRegistration();
        assertEquals(true,registration.toValidateFirstName("Amit"));
    }

}
