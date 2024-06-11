package org.example.petmanage1.service;

import jakarta.transaction.Transactional;
import org.example.petmanage1.domain.Orders;
import org.example.petmanage1.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdersService {
    private OrdersRepository ordersRepository;
    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }
    //创建订单
    @Transactional
    public Orders creatOrders(Orders orders) {
        return ordersRepository.save(orders);
    }
    //更新订单状态
    public Orders updateOrderStatus(Long ordersId,String newOrderStatus){
        Optional<Orders> optionalOrder = ordersRepository.findById(ordersId);
        if (optionalOrder.isPresent()) {
            Orders existingOrder = optionalOrder.get();
            existingOrder.setOrderStatus(newOrderStatus);
            return ordersRepository.save(existingOrder);
        } else {
            throw new IllegalArgumentException("Order with id " + ordersId + " not found");
        }
    }
}
