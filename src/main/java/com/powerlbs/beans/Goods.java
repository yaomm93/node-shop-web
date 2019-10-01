package com.powerlbs.beans;

/**
 * ClassName:${name}
 * package:com.powerlbs.beans
 *
 * @date:2019/9/28 20:11
 * @author:Yaoxiaoming
 **/
public class Goods {
    private String name;
    private Float price;
    private Integer amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
