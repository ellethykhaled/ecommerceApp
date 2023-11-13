package com.EcommerceApp.OrderService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
    private BigDecimal itemPrice;

}
