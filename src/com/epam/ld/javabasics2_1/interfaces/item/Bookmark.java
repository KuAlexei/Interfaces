package com.epam.ld.javabasics2_1.interfaces.item;

import com.epam.ld.javabasics2_1.interfaces.AShopItem;

import java.util.Objects;

public class Bookmark extends AShopItem {

    private String color;
    private String material;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bookmark bookmark = (Bookmark) o;
        return Objects.equals(getColor(), bookmark.getColor()) && Objects.equals(getMaterial(), bookmark.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getColor(), getMaterial());
    }

}
