import java.util.ArrayList;
import java.util.Collections;

public class Mainn {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> DC = new Team<>("DC");
        DC.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(DC.numPlayers());

        Team<BaseballPlayer> rcb= new Team<>("RCB");
       rcb.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("Punjab super kings");
        DC.addPlayer(joe);

        Team<FootballPlayer> CSK = new Team<>("CSK");
        FootballPlayer banks = new FootballPlayer("Halland");
        DC.addPlayer(banks);

        Team<FootballPlayer> MI= new Team<>("MI");
        Team<FootballPlayer> Juve= new Team<>("Juve");

        MI.matchResult(MI, 1, 0);
        DC.matchResult(DC, 3, 8);

        DC.matchResult(MI, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(DC.getName() + ": " + DC.ranking());
        System.out.println(MI.getName() + ": " + MI.ranking());
        System.out.println(CSK.getName() + ": " + CSK.ranking());
        System.out.println(rcb.getName() + ": " + rcb.ranking());

        System.out.println(DC.compareTo(MI));
        System.out.println(MI.compareTo(CSK));

        ArrayList<Team> teams;
    }
}
