import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StepTrackerTest {

    // Valid step count
    @Test
    public void testValidStepCount() {
        assertTrue(StepTracker.logStepCount(5000));
    }

    // Invalid step count (negative value)
    @Test
    public void testInvalidStepCount() {
        assertFalse(StepTracker.logStepCount(-100));
    }

    // Exceptional step count (non-negative, but still an exceptional case)
    @Test
    public void testExceptionalStepCount() {
        assertTrue(StepTracker.logStepCount(0));
    }
}