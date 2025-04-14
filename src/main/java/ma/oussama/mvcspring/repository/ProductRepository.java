package ma.oussama.mvcspring.repository;

import ma.oussama.mvcspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
