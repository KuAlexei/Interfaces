package com.epam.ld.javabasics2_1.interfaces.item;

import com.epam.ld.javabasics2_1.interfaces.AShopItem;

import java.util.Objects;

public class Spruce extends AShopItem {

    private String type;
    private String color;
    private int height;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Spruce spruce = (Spruce) o;
        return getHeight() == spruce.getHeight() && Objects.equals(getType(), spruce.getType()) && Objects.equals(getColor(), spruce.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), getColor(), getHeight());
    }

}
