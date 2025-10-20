package org.example;

public class PhisicalProduct extends Product{

    private int weight;

    public PhisicalProduct(int id, String name, int price, int weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", weight=" + weight + " KG";
    }
}
