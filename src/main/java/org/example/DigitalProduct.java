package org.example;

public class DigitalProduct extends Product{

    private int size;

    public DigitalProduct(int id, String name, int price, int size) {
        super(id, name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", size=" + size + " MB";
    }
}
