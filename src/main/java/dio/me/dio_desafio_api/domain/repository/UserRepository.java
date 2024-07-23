package dio.me.dio_desafio_api.domain.repository;

import dio.me.dio_desafio_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
