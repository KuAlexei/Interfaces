package com.epam.ld.javabasics2_1.interfaces;

import java.util.Objects;

public abstract class AShopItem implements IShopItem {

    private double price;
    private Supplier supplier;
    private String name;

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AShopItem aShopItem = (AShopItem) o;
        return Double.compare(aShopItem.getPrice(), getPrice()) == 0 && Objects.equals(getSupplier(), aShopItem.getSupplier()) && Objects.equals(getName(), aShopItem.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getSupplier(), getName());
    }

}
