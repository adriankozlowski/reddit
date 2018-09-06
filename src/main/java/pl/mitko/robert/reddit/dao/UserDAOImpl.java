package pl.mitko.robert.reddit.dao;

import pl.mitko.robert.reddit.model.User;
import pl.mitko.robert.reddit.util.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    Connection connection;
    private static final String CREATE_USER =
            "INSERT INTO user(username, email, password, is_active) VALUES(?, ?, ?, ?);";

    public UserDAOImpl() {
        connection = ConnectionProvider.getConnection();
    }

    @Override
    public User create(User user) {
        try {
            User resultUser = new User(user);
//        KeyHolder holder = new GeneratedKeyHolder();
//        SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USER);
            preparedStatement.setString(1, resultUser.getUsername());
            preparedStatement.setString(2, resultUser.getEmail());
            preparedStatement.setString(3, resultUser.getPassword());
            preparedStatement.setBoolean(4, true);
            int update = preparedStatement.executeUpdate();

            if (update > 0) {
//                resultUser.setId((Long) holder.getKey());// baza sama wygeneruje ID
                setPrivigiles(resultUser);
            }
            return resultUser;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void setPrivigiles(User user) {
        try {
        final String userRoleQuery = "INSERT INTO user_role(username) VALUES(?)";
            PreparedStatement preparedStatement = connection.prepareStatement(userRoleQuery);
//            template.update(userRoleQuery, paramSource);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(User updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
