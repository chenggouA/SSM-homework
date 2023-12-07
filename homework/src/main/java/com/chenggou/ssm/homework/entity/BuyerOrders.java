package com.chenggou.ssm.homework.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data  // 订单实体类
public class BuyerOrders {
    private int orderID;
    private int buyerID;
    private int clothingID;
    @JsonFormat(pattern = "yyyy-MM-dd") // 对属性的值格式化
    private Date purchaseDate;
    private String orderNumber;
    private BigDecimal paymentAmount;
}
