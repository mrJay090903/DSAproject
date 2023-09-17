package username.login.main;

public class UserCred {

    // Function for the login process
    public static boolean login(String username, String password) {
        // Define the usernames and passwords arrays
        String[] usernames = {"cope", "barcelona", "belaos", "dacillo", "broqueza"};
        String[] passwords = {"admin1", "admin2", "admin3", "admin4", "admin5"};

        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                return true;
            }
        }
        return false;
    }
	
}
