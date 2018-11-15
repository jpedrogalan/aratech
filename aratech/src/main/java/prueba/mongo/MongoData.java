package prueba.mongo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import prueba.model.User;
import prueba.mongo.UserRepository;

@Component
public class MongoData implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        repository.save(new User("Usuario 1", new Date()));
        repository.save(new User("Usuario 2",new Date()));
        repository.save(new User("Usuario 3",new Date()));

    }

}
