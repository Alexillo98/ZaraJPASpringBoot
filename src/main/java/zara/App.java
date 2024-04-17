package zara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zara.entity.Empleado;
import zara.repository.EmpleadoRepository;

@SpringBootApplication
public class App implements CommandLineRunner {
    private EmpleadoRepository empleadoRepository;

    @Autowired
    public App (EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Override
    public void run(String... args){
        empleadoRepository.findAll().forEach(System.out::println);
    }
}