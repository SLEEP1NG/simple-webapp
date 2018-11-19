package com.dancingcloudservices.model;

public class MyModel {
    private String name;
    private int creditLimit;

    public MyModel() {}

    public MyModel(String name, int creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "MyModel{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
