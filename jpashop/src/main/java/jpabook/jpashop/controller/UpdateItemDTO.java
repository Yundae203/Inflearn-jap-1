package jpabook.jpashop.controller;

import lombok.Getter;

@Getter
public abstract class UpdateItemDTO {

    protected Long id;

    protected String name;
    protected int price;
    protected int stockQuantity;

}
