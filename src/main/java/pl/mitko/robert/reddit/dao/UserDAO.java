package pl.mitko.robert.reddit.dao;

import pl.mitko.robert.reddit.model.User;

import java.util.List;

public interface UserDAO extends GenericDAO<User, Long> {

    List<User> getAll();
    User getUserByUsername(String username);
}
