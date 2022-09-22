package weather;
import java.util.ArrayList;
import java.util.Comparator;

import static fileProcessing.FileProcessing.getRowsFromFile;


public class DataWeatherDataProcessing {
    public static ArrayList<WeatherDataRow>extractWeatherData(ArrayList<String> dataRows){
       ArrayList<WeatherDataRow> weatherRowData = new ArrayList<>();
        for (String row:dataRows) {
            if (row.length()>0) {
                row = row.trim();
                if (row.charAt(0) >= 48 && row.charAt(0) <= 57) {
                    String[] rowSplitted = row.split("\s+");
                    WeatherDataRow currentDay = new WeatherDataRow();
                    currentDay.setDay(Integer.parseInt(rowSplitted[0].replaceAll("[\\D+]","")));
                    currentDay.setMaxTemperature(Integer.parseInt(rowSplitted[1].replaceAll("[\\D]","")));
                    currentDay.setMinTemperature(Integer.parseInt(rowSplitted[2].replaceAll("[\\D]","")));
                    weatherRowData.add(currentDay);
                }
            }
        }
       return weatherRowData;
    }

    public static int getDayMinimumTempDelta(ArrayList<WeatherDataRow> weatherData){
        return weatherData.stream().min(Comparator.comparingInt((WeatherDataRow::calcTemperatureDiff))).get().getDay();
    }

    public static int getDayOfMinDeltaT(String filePath){
        return getDayMinimumTempDelta(extractWeatherData(getRowsFromFile(filePath))) ;
    }

}

