package io.mhan.springjpatest2.users.repository;

import io.mhan.springjpatest2.users.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long>, UserQueryDslRepository {

    List<User> findAll();

    List<User> findByIdIn(List<Long> ids);

    Optional<User> findByUsername(String username);
}
