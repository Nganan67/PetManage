package org.example.petmanage1.repository;

import org.example.petmanage1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //根据用户名称查询用户
    User findByUserName(String userName);
}
