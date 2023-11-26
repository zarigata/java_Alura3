package com.zarigata.tank;

public class Tank {
    // NON ALOCATED IN MATH //
    private String Name; // name of the tank
    private String Version; //the variant of the tank
    private String Nation; // What Country mad the tank
    private int Year; // year of first rollout
    private boolean Unlocked; // if it is unlocked to the player
    private double br; // the rank it is
    //========//
    private int Ammo; // what ammo was shot

    public Tank() {
    }
    //=======//

    public void setName(String name) {
        this.Name = name;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public void setBr(double br) {
        this.br = br;
    }

    //METHODS
    public void showDetails(){//this classifies the tank details
        System.out.println("Name : " + Name);
        System.out.println("Year : " +Year);
        System.out.println("Battle Rate" + br);
    }
}


// so here it is modified to run a get some results