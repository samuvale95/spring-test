package _rc.assessment.test.repository;

import _rc.assessment.test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}