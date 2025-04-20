package luminite.tech.springdocker;

import java.util.List;

import lombok.RequiredArgsConstructor;
import luminite.tech.springdocker.entity.Product;
import luminite.tech.springdocker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class SpringDockerApplication {

    private final ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }
}
