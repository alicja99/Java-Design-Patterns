package com.company.prototype;

public class RoboticTree extends Tree{
    private String name;

    public RoboticTree(double height, double weight) {
        super();
        this.name = "Robotic Tree";
    }

    public String getName() {
        return name;
    }

    @Override
    public Tree copy() {
        RoboticTree roboticTreeClone = new RoboticTree(this.getHeight(), this.getWeight());
        roboticTreeClone.setCoordinate(this.getCoordinate());
        return roboticTreeClone;
    }
}
