package CSVtoTXT;

import java.io.*;

import javax.swing.JFileChooser;

public class FileChooser {
    public static String chooseFile(){
        JFileChooser chooser = new JFileChooser();;
        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }
        return null;
    }
}
