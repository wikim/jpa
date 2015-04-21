package net.iq.service;

import java.util.List;

import net.iq.domain.User;

public interface UserProvider {
    public void insertUser(User user);
    public List<User>  findAllUsers();
    public User  findUserByUserId(String userId);
}
