package CSVtoTXT;

public class App
{  
    public static void main(String[] args) throws Exception  
    {  
        String file = FileChooser.chooseFile();
        String time = GetTime.getTime();
        for( int i = 1; i < NoOfRows.noOfRows(file); i++)
            UpdateCSV.updateCSV(file, time, i, 1);
        Converter.CSVtoTXT(file, time+".txt", "UTF-8");
    }
}