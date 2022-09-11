package weather;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherMethods {

    public static void getWeathercollection(){
        Scanner scan = null;
        try {
            scan = new Scanner(new File("C:\\Users\\sow\\IdeaProjects\\kata\\kata04\\Data\\weather.dat"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
        //Öffne Datei
        //Lese Zeilen
        //Wenn Zeile nicht mit Zahl losgeht ignoriere die Zeile


    }

}
