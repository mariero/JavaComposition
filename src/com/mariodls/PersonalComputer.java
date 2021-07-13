package com.mariodls;

public class PersonalComputer {

    private Tower tower;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(Tower tower, Monitor monitor, Motherboard motherboard) {
        this.tower = tower;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //Changing the access modifier from public to private, we cannot have access to the getter getTower
    private Tower getTower() {
        return tower;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    //Changing the access modifier from public to private, we cannot have access to the getter getMotherboard
    private Motherboard getMotherboard() {
        return motherboard;
    }
}
