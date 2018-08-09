package pits.dao;


import pits.model.User;

import java.util.List;

public interface UserDao {
	
	List<User> getUser();
	User findUserByEmail(String email);

}
