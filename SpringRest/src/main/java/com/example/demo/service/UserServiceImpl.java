package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;

	@Override
	public void Store(User user) {
		// TODO Auto-generated method stub
//		String query = "INSERT INTO User(name,email,password,mobile,gender,date,month,year,addressarea) VALUES(?,?,?,?,?,?,?,?,?)";
//		try {
//			preparedStatement = ConnectionHandler.getConnection().prepareStatement(query);
//			preparedStatement.setString(1, user.getNameField());
//			preparedStatement.setString(2, user.getEmailField());
//			preparedStatement.setString(3, user.getPasswordField());
//			preparedStatement.setString(4, user.getMobileField());
//			preparedStatement.setString(5, user.getradioButton());
//			preparedStatement.setString(6, user.getDate());
//			preparedStatement.setString(7, user.getMonth());
//			preparedStatement.setString(8, user.getYear());
//			preparedStatement.setString(9, user.getAddressArea());
//			preparedStatement.execute();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		userRepo.save(user);
	}

	@Override
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub
//		try {
//			String query = "Select * from User where email='" + email + "' AND password='" + password + "'";
//			preparedStatement = ConnectionHandler.getConnection().prepareStatement(query);
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			while (resultSet.next()) {
//				user = new User();
//				user.setNameField(resultSet.getString(1));
//				user.setEmailField(resultSet.getString(2));
//				user.setPasswordField(resultSet.getString(3));
//				user.setMobileField(resultSet.getString(4));
//				user.setradioButton(resultSet.getString(5));
//				user.setDate(resultSet.getString(6));
//				user.setMonth(resultSet.getString(7));
//				user.setYear(resultSet.getString(8));
//				user.setAddressArea(resultSet.getString(9));
//			}
//
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		return user;		
		return userRepo.findByEmailFieldAndPasswordField(email, password);
	}

}
