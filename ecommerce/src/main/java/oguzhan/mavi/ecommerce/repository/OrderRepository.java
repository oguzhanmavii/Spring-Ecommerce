package oguzhan.mavi.ecommerce.repository;

import oguzhan.mavi.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
