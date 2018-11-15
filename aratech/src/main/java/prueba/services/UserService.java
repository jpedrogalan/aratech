package prueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.model.User;
import prueba.mongo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}
	public User findById(String id) {
		return userRepository.findOne(id);
	}
	
	public boolean insertUser(User user) {

       User newUser = userRepository.save(user);
       return newUser!=null;
	}
	
	public boolean deleteUserById(String id) {
		User user = findById(id);
		if(user!=null) {
			userRepository.delete(id);
			return true;
		}else {
			return false;
		}
	}
}
