package com.youcode.youcodePlatforme.DAO;

import com.youcode.youcodePlatforme.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    public void updateUser(User user) throws SQLException;
    public void delete(long id) throws SQLException;
  public List<User> getListOfUsers();
    public Object authenticateUser(String email, String password);
    public List<User> listStudent() throws SQLException;
    public List<User> listFormateur() throws SQLException;

}
