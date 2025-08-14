package co.edu.javeriana.ejemplojpa.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import co.edu.javeriana.ejemplojpa.model.Person;
import co.edu.javeriana.ejemplojpa.repository.PersonRepository;

@Component
public class DbInitializer implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        Person p = new Person("123", "Alice", "Alisson");

        personRepository.save(p); 
    }
    
}
