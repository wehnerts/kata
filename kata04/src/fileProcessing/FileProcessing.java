package fileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessing {
    public static ArrayList<String> getRowsFromFile(String filePath){
        ArrayList<String> dataRows = new ArrayList<String>();
        Scanner scan = null;
        try {
            scan = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            assert scan != null;
            if (!scan.hasNext()) break;
            dataRows.add(scan.nextLine());
        }
        scan.close();
        return dataRows;
    }

}
