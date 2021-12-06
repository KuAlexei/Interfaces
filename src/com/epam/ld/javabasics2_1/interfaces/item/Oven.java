package com.epam.ld.javabasics2_1.interfaces.item;

import com.epam.ld.javabasics2_1.interfaces.AShopItem;

import java.util.Objects;

public class Oven extends AShopItem {

    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return Objects.equals(getMake(), oven.getMake()) && Objects.equals(getModel(), oven.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMake(), getModel());
    }

}
