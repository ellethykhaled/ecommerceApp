package com.EcommerceApp.OrderService.dao;

import com.EcommerceApp.OrderService.dto.OrderItemPK;
import com.EcommerceApp.OrderService.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDao extends JpaRepository<OrderItem, OrderItemPK> {

//    @Query("SELECT oi FROM OrderItem oi WHERE oi.orderId = :orderId and oi.productId = :productId")
//    OrderItem findByOrderIdAndProductId(@Param("orderId") Long orderId, @Param("productId") Long productId);

    List<OrderItem> findByOrderId(Integer orderId);
}
