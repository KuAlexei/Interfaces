package com.epam.ld.javabasics2_1.interfaces.item;

import com.epam.ld.javabasics2_1.interfaces.AShopItem;
import com.epam.ld.javabasics2_1.interfaces.enums.Color;
import com.epam.ld.javabasics2_1.interfaces.enums.Shape;

import java.util.Objects;

public class Flowerpot extends AShopItem {

    private Shape shape;
    private Color color;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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
