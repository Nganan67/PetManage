package org.example.petmanage1.repository;

import org.example.petmanage1.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
    // 根据订单ID查询订单详情
    Orders findByOrdersId(Long ordersId);
    // 根据订单状态查询订单列表
    List<Orders> findByOrderStatus(String orderStatus);
    // 根据用户 ID 查询订单列表（按照订单 ID 降序排列）
    List<Orders> findByUserIdOrderByOrdersIdDesc(Long userId);
}
