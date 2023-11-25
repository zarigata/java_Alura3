package com.zarigata.tank;

import com.zarigata.tank.Tank;

public class Main {
    public static void main(String[] args) {
        Tank myTank = new Tank();
        myTank.setName("Panzerkranfwagent AuFs1");
        myTank.setYear(1941);
        myTank.setBr(6.3);
        myTank.showDetails();
        myTank.totalWins(58);
        myTank.totalWins(66);
        //System.out.println(myTank.LastVictory);
        System.out.println(myTank.getBattles());
        System.out.println(myTank.averageBattles());
    }
}
