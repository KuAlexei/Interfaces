package com.epam.ld.javabasics2_1.interfaces.enums;

public enum Color {
    WHITE(0xFFFFFF),
    BLACK(0x000000),
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    private final int rgb;

    Color(int rgb) {
        this.rgb = rgb;
    }

    public int getRgb() {
        return rgb;
    }

}
