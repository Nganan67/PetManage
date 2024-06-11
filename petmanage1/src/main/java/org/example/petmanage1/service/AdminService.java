package org.example.petmanage1.service;

import org.example.petmanage1.domain.Admin;
import org.example.petmanage1.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private AdminRepository adminRepository;
    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    public Admin getAdmin(Admin admin) {
        // 实现注册管理员的逻辑...
        // 可以调用 adminRepository 来保存管理员信息到数据库
        return adminRepository.save(admin);
    }
    public Admin login(String adminName, String adminPassword) {
        // 实现登录管理员的逻辑...
        // 可以调用 adminRepository 来查询管理员信息
        return adminRepository.findByAdminName(adminName);
    }
}