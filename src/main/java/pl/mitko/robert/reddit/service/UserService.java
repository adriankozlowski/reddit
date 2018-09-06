package pl.mitko.robert.reddit.service;

import pl.mitko.robert.reddit.dao.DAOFactory;
import pl.mitko.robert.reddit.dao.UserDAO;
import pl.mitko.robert.reddit.model.User;

public class UserService {
    public void addUser(String username, String email, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setActive(true);
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDao = factory.getUserDAO();
        userDao.create(user);
    }
}