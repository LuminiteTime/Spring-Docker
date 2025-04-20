package luminite.tech.springdocker.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import luminite.tech.springdocker.entity.Product;
import luminite.tech.springdocker.repository.ProductRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
