public class WaterIntake {

    public static boolean isValidWaterIntake(double intake) {
        // Check that the water intake is not negative
        return intake >= 0;
    }

    public static boolean logWaterIntake(double intake) {
        boolean isValidIntake = isValidWaterIntake(intake);

        if (isValidIntake) {
            System.out.println("Water intake logged successfully: " + intake + " oz");
            return true;
        } else {
            System.out.println("Invalid water intake. Please enter a non-negative value.");
            return false;
        }
    }
}
