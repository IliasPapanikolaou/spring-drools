package com.unipi.ipap.springdrools.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String name;
    private String cardType;
    private Integer discount;
    private Integer price;

}
