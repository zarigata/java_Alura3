package com.zarigata.tank;

public class Tank {
    // NON ALOCATED IN MATH //
    private String Name; // name of the tank
    private String Version; //the variant of the tank
    private String Nation; // What Country mad the tank
    private int Armour;
    private int Penetration;
    private int Year; // year of first rollout
    private double Br; // the rank it is
    //========//

    public Tank() {
    }
    //=======//

    public void setName(String name) {this.Name = name;}

    public void setYear(int year) {this.Year = year;}

    public void setBr(double Br) {this.Br = Br;}

    public void setArmour(int Armour) {this.Armour = Armour;}

    public void setPenetration(int Penetration) {this.Penetration = Penetration;}


    //METHODS
    public void showDetails(){//this classifies the tank details
        System.out.println("Name : " + Name);
        System.out.println("Year : " +Year);
        System.out.println("Battle Rate " + Br);
        System.out.println("Bullet Max Penetration " + Penetration);
        System.out.println("Armour " + Armour);
        System.out.println("Defence " + (Armour - Penetration));
    }
}


// so here it is modified to run a get some results