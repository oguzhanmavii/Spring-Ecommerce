package oguzhan.mavi.ecommerce.repository;

import oguzhan.mavi.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
