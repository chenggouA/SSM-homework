package com.chenggou.ssm.homework.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Clothing {
    private int clothingID;
    private String name;
    private String category;
    private String style;
    private BigDecimal price;
    private String size;
    private String color;


}
