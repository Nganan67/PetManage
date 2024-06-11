package org.example.petmanage1.repository;

import org.example.petmanage1.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    //根据管理员名称查询管理员
    Admin findByAdminName(String adminName);
}
