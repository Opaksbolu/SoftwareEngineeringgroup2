public class StepTracker {

    public static boolean isValidStepCount(int steps) {
        // Check that the step count is not negative
        return steps >= 0;
    }

    public static boolean logStepCount(int steps) {
        boolean isValidStepCount = isValidStepCount(steps);

        if (isValidStepCount) {
            System.out.println("Step count logged successfully: " + steps + " steps");
            return true;
        } else {
            System.out.println("Invalid step count. Please enter a non-negative value.");
            return false;
        }
    }
}
