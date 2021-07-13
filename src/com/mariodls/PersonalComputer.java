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

    public Tower getTower() {
        return tower;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
