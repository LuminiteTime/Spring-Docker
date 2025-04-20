package luminite.tech.springdocker.repository;

import luminite.tech.springdocker.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
