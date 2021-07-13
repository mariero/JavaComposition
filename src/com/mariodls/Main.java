package com.mariodls;

public class Main {
    public static void main(String[] args) {

        Tower tower1 = new Tower("Rocket", "Kolink", "220", new Dimensions(125, 235, 328));
        Monitor monitor1 = new Monitor("U2414H", "Dell", 24, new Resolution(40,25));
        Motherboard motherboard1 = new Motherboard("Ebq123", "Asus", 2, 4, "ver.1.2.5");

        PersonalComputer personalComputer1 = new PersonalComputer(tower1, monitor1, motherboard1);

        personalComputer1.getMonitor().drawPixelAt(240,480,"White");
        personalComputer1.getTower().pressPowerButton();


    }
}
