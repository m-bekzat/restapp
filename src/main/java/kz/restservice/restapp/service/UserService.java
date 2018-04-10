package kz.restservice.restapp.service;

import kz.restservice.restapp.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
