package org.example.petmanage1.repository;

import org.example.petmanage1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //根据用户名称查询用户
    User findByUserName(String userName);
    //根据用户ID查询用户
}
