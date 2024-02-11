package oguzhan.mavi.ecommerce.repository;

import oguzhan.mavi.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
