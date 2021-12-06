package com.epam.ld.javabasics2_1.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {

    private final List<IShopItem> items;

    public Basket(List<IShopItem> items) {
        this.items = items;
    }

    public Basket() {
        this(new ArrayList<>());
    }

    public List<IShopItem> getItems() {
        return items;
    }

    public double totalPrice() {
        return items.stream().map(IShopItem::getPrice).reduce(0.0, Double::sum);
    }

    public String receipt() {
        return items.stream().map(i -> String.format("%s\t%.2f", i.getName(), i.getPrice())).collect(Collectors.joining("\n"));
    }
}
