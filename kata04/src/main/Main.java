package main;

import static soccer.SoccerDataProcessing.getTeamWithMinDeltaGoals;
import static weather.DataWeatherDataProcessing.*;


public class Main {
    public static void main(String[] args) {
      //System.out.println("On day "+getDayOfMinDeltaT("C:\\Users\\sow\\IdeaProjects\\kata\\kata04\\Data\\weather.dat")+" delta T was minimum");
        System.out.println(getTeamWithMinDeltaGoals("C:\\Users\\sow\\IdeaProjects\\kata\\kata04\\Data\\football.dat"));
    }
}