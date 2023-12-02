public class usernameCreation {

    public static boolean isValidUsername(String username) {
        // Check that the username is not null and not empty
        if (username == null || username.isEmpty()) {
            return false;
        }

        // Check that the username contains only alphanumeric characters
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }

        return true;
    }

    public static boolean createUsername(String username) {
        boolean isValidUsername = isValidUsername(username);

        if (isValidUsername) {
            System.out.println("Username created successfully: " + username);
            return true;
        } else {
            System.out.println("Invalid username");
            return false;
        }
    }
}