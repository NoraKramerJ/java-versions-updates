package cydeo.PlayerTask;

import cydeo.PlayerTask.BaseballPlayer;
import cydeo.PlayerTask.FootballPlayer;
import cydeo.PlayerTask.SoccerPlayer;
import cydeo.PlayerTask.Team;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {


        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Apple");


        printDoubled(items);


        System.out.println("***********************");


        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool= new Team("Liverpool");
       // liverpool.addPlayer(joe);
      // liverpool.addPlayer(pat);
      liverpool.addPlayer(beckham);

//Team<String> brokenTeam= new Team<String>("what kind of team is this?");
        /* this is an example that when we extended the T from the parent class Player,
        it limits the use of T to only player classes(Soccer team, football team, Baseball team).

         */

    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer i : items) {
            System.out.println(i * 2);
        }
    }
}
