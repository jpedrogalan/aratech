package prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.model.User;
import prueba.services.UserService;

@RestController
public class MainController {

	@Autowired 
	private UserService userService;
	
    @RequestMapping("/")
    public String index() {
        return "Java Exercise UID by Juan Pedro Galán";
    }
    
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
    	return  userService.getAllUsers();
    }

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") String id){
    	return userService.findById(id);
    }
    
    @PostMapping("/saveUser")
    public ResponseEntity<String> addUser(@RequestBody User user){
    	userService.insertUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable  String id){
    	
    	if(userService.deleteUserById(id)) {
    		return new ResponseEntity<>(HttpStatus.ACCEPTED);
    	}else {
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
    }
}
