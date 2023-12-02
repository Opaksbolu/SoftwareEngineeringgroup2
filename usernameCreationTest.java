import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class usernameCreationTest {
    // Valid username
    @Test
    public void testValidUsername() {
        assertTrue(usernameCreation.createUsername("pxc190031"));
    }

    // Invalid username (contains special character)
    @Test
    public void testInvalidUsername() {
        assertFalse(usernameCreation.createUsername("pxc190031@$"));
    }

    // Exceptional username (contains spaces)
    @Test
    public void testExceptionalUsername() {
        assertFalse(usernameCreation.createUsername("pxc     190031"));
    }
}
