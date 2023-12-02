import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WaterIntakeTest {

    // Valid water intake
    @Test
    public void testValidWaterIntake() {
        assertTrue(WaterIntake.logWaterIntake(2.5));
    }

    // Invalid water intake (negative value)
    @Test
    public void testInvalidWaterIntake() {
        assertFalse(WaterIntake.logWaterIntake(-1.0));
    }

    // Exceptional water intake (non-negative, but still an exceptional case)
    @Test
    public void testExceptionalWaterIntake() {
        assertTrue(WaterIntake.logWaterIntake(0.0));
    }
}
