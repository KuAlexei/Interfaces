package com.epam.ld.javabasics2_1.interfaces.item;

import com.epam.ld.javabasics2_1.interfaces.AShopItem;

import java.util.Objects;

public class Flowerpot extends AShopItem {

    private String shape;
    private String color;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
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
        Flowerpot flowerpot = (Flowerpot) o;
        return Objects.equals(getShape(), flowerpot.getShape()) && Objects.equals(getColor(), flowerpot.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getShape(), getColor());
    }

}
