package soccer;

public class SoccerDataRow {
    private String teamName;
    private int goalsForTeam;
    private int goalsAgainstTeam;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void setGoalsForTeam(int goalsForTeam){
        this.goalsForTeam = goalsForTeam;
    }
    public void setGoalsAgainstTeam(int goalsAgainstTeam) {
        this.goalsAgainstTeam = goalsAgainstTeam;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGoalsForTeam() {
        return goalsForTeam;
    }

    public int getGoalsAgainstTeam() {
        return goalsAgainstTeam;
    }

    public int getDeltaGoals(){
        return Math.abs (goalsForTeam-goalsAgainstTeam);
    }
}
