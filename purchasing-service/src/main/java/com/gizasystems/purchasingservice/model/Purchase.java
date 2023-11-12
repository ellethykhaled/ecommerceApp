package com.gizasystems.purchasingservice.model;

import com.gizasystems.purchasingservice.dto.PurchaseDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Integer id;

    @Column(name = "product_id", unique = true)
    private Integer productId;

    @Column(name = "num_of_purchases")
    private Integer numOfPurchases;

    public Purchase() {
    }

    public Purchase(Integer productId, Integer numOfPurchases) {
        this.productId = productId;
        this.numOfPurchases = numOfPurchases;
    }

    public static Purchase from(PurchaseDTO purchaseDTO) {
        return new Purchase(purchaseDTO.productId(), purchaseDTO.quantity());
    }

    public Integer getId() {
        return id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getNumOfPurchases() {
        return numOfPurchases;
    }

    public void setNumOfPurchases(Integer numOfPurchases) {
        this.numOfPurchases = numOfPurchases;
    }

    public void increaseNumOfPurchases(Integer addNumOfPurchases) {
        this.numOfPurchases = getNumOfPurchases() + addNumOfPurchases;
    }
}
