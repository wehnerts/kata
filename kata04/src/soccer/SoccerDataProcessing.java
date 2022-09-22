package soccer;

import java.util.ArrayList;
import java.util.Comparator;

import static fileProcessing.FileProcessing.getRowsFromFile;

public class SoccerDataProcessing {

    public static ArrayList<SoccerDataRow> buildSoccerData(ArrayList<String> allFilerows){
        ArrayList <SoccerDataRow> allDataRows = new ArrayList<SoccerDataRow>();
        for (String row : allFilerows) {
                row=row.strip();
                if(row.charAt(0) >= 48 && row.charAt(0) <= 57){
                    String[] rowSplitted = row.split("\s+");
                    SoccerDataRow dataRow = new SoccerDataRow();
                        dataRow.setTeamName(rowSplitted[1]);
                        dataRow.setGoalsForTeam(Integer.parseInt(rowSplitted[6].replaceAll("[\\D+]","")));
                        dataRow.setGoalsAgainstTeam(Integer.parseInt(rowSplitted[8].replaceAll("[\\D+]","")));
                        allDataRows.add(dataRow);
            }
        }
        return allDataRows;
    }

    public static String getTeamWithMinDeltaGoals(String filePath){

        return buildSoccerData(getRowsFromFile(filePath)).stream().min(Comparator.comparingInt(SoccerDataRow::getDeltaGoals)).get().getTeamName();

    }
}
