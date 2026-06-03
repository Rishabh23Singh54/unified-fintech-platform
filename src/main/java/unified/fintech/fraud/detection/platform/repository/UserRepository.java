package unified.fintech.fraud.detection.platform.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import unified.fintech.fraud.detection.platform.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
