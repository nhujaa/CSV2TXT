package CSVtoTXT;

import java.io.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.util.List;

public class UpdateCSV {
    public static void updateCSV(String fileToUpdate, String replace, int row, int col) throws IOException, CsvException {
        File input = new File(fileToUpdate);
        CSVReader reader = new CSVReader(new FileReader(input));
        List <String[]> csvBody = reader.readAll();
        csvBody.get(row)[col] = replace;
        reader.close();
    
        CSVWriter writer = new CSVWriter(new FileWriter(input), ',',
        CSVWriter.NO_QUOTE_CHARACTER,
        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
        CSVWriter.DEFAULT_LINE_END);
        writer.writeAll(csvBody);
        writer.flush();
        writer.close();
    }
}
