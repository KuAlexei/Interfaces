package com.epam.ld.javabasics2_1.interfaces.item;

import com.epam.ld.javabasics2_1.interfaces.AShopItem;

import java.util.Objects;

public class Fridge extends AShopItem {

    private String make;
    private String model;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fridge fridge = (Fridge) o;
        return Objects.equals(getMake(), fridge.getMake()) && Objects.equals(getModel(), fridge.getModel()) && Objects.equals(getColor(), fridge.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMake(), getModel(), getColor());
    }

}
