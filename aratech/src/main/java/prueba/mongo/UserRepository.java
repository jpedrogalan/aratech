package prueba.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import prueba.model.User;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

	public List<User> findAll();

	public User findOne(String id);

	@SuppressWarnings("unchecked")
	public User save(User user);

	public void delete(User user);
}
