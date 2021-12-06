package com.epam.ld.javabasics2_1.interfaces;

import java.util.Objects;

public class Supplier {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(getName(), supplier.getName()) && Objects.equals(getAddress(), supplier.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress());
    }
}
