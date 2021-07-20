package CSVtoTXT;

import java.io.*;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class NoOfRows {
    public static int noOfRows(String inputFile) throws IOException, CsvException {
        File input = new File(inputFile);
        CSVReader reader = new CSVReader(new FileReader(input));
        int count = 0;
        while (reader.readNext() != null){
            count++;
        }
        return count;
    }
}
