package ru.sasha.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sasha.springcourse.models.User;
@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
