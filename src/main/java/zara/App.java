package zara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zara.repository.EmpleadoRepository;

@SpringBootApplication
public class App {
    private EmpleadoRepository empleadoRepository;

    @Autowired
    public App (EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    //@Override
    public void run(String... args){

    }
}
