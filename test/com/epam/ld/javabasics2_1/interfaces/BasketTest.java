package com.epam.ld.javabasics2_1.interfaces;

import com.epam.ld.javabasics2_1.interfaces.item.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BasketTest {

    @Test
    void receipt() {
        Supplier supplier1 = new Supplier();
        Supplier supplier2 = new Supplier();

        Book book = new Book();
        book.setName("Java for dummies");
        book.setPrice(2.44);
        book.setSupplier(supplier1);
        book.setAuthor("Barry A. Burd");
        book.setTitle("Java For Dummies");

        Bookmark bookmark = new Bookmark();
        bookmark.setName("Red bookmark");
        bookmark.setPrice(0.14);
        bookmark.setSupplier(supplier1);
        bookmark.setColor("red");
        bookmark.setMaterial("wood");

        Flowerpot flowerpot = new Flowerpot();
        flowerpot.setName("Blue pot");
        flowerpot.setPrice(5.00);
        flowerpot.setSupplier(supplier2);
        flowerpot.setColor("blue");
        flowerpot.setShape("round");

        Fridge fridge = new Fridge();
        fridge.setName("Atlant MX");
        fridge.setPrice(400.50);
        fridge.setSupplier(supplier2);
        fridge.setColor("white");
        fridge.setMake("Atlant");
        fridge.setModel("MX");

        Oven oven = new Oven();
        oven.setName("Samsung MVO120");
        oven.setPrice(200.0);
        oven.setSupplier(supplier2);
        oven.setMake("Samsung");
        oven.setModel("MVO120");

        Spruce spruce = new Spruce();
        spruce.setName("Christmas tree");
        spruce.setPrice(800.99);
        spruce.setSupplier(supplier2);
        spruce.setType("Norway spruce");
        spruce.setColor("green");
        spruce.setHeight(300);

        List<IShopItem> items = new ArrayList<>();
        items.add(book);
        items.add(bookmark);
        items.add(flowerpot);
        items.add(fridge);
        items.add(oven);
        items.add(spruce);

        Basket basket = new Basket(items);
        System.out.println(basket.totalPrice());
        System.out.println(basket.receipt());

    }

}