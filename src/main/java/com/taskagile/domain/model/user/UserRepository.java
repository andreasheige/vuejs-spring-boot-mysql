package com.taskagile.domain.model.user;

/**
 * User repository interface
 */
public interface UserRepository {

    /**
     * Find user by a username
     * 
     * @param username the provided username for finding user
     * @return an instance of <code>User</code> if found, null otherwise
     */
    User findByUsername(String username);

    /**
     * Find user by an email adress
     * 
     * @param emailAddress the provided email address used for finding user
     * @return an instance of <code>User</user> if found, null otherwise
     */
    User findByEmailAddress(String emailAddress);

    /**
     * Save a new user on an existing user
     * 
     * @param user the user instance to be saved
     * @return the newly save user
     */
    void save (User user);

}