package use_case.login;

/**
 * The LoginOutputData class represents the output data for the login use case.
 * It holds information to be presented in the view after a login attempt.
 */
public record LoginOutputData(String username, String id, boolean successful) {

    /**
     * Constructs a LoginOutputData object with the provided username and success status.
     *
     * @param username   The username associated with the login attempt.
     * @param successful True if the login was successful, false otherwise.
     */
    public LoginOutputData {
    }

    /**
     * Gets the username associated with the login attempt.
     *
     * @return The username.
     */
    @Override
    public String username() {
        return username;
    }

    /**
     * Gets the id associated with the login attempt.
     *
     * @return The username.
     */
    @Override
    public String id(){return id;}

    /**
     * Checks if the login was successful.
     *
     * @return True if the login was successful, false otherwise.
     */
    @Override
    public boolean successful() {
        return successful;
    }
}
