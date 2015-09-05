package io.github.movax10.sublator.persist.repo;

import io.github.movax10.sublator.persist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {

}
