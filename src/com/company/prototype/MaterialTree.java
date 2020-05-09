package com.company.prototype;

public class MaterialTree extends Tree {
    private String name;

    public MaterialTree(double height, double weight) {
        super();
        this.name = "Material Tree";
    }

    public String getName() {
        return name;
    }

    @Override
    public Tree copy() {
        MaterialTree materialTreeClone = new MaterialTree(this.getHeight(), this.getWeight());
        materialTreeClone.setCoordinate(this.getCoordinate());
        return materialTreeClone;
    }
}
