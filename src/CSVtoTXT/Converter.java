package CSVtoTXT;

import java.io.*;

public class Converter {
    public static File CSVtoTXT(String inputFile, String filename, String encoding) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String words;
        File txtFile = new File(filename);
        if( !txtFile.isFile() ){
            txtFile.createNewFile();
        }
        try{
			br	= new BufferedReader(new FileReader(inputFile));
			bw = new BufferedWriter(new FileWriter(txtFile));
			while ((words = br.readLine()) != null) {
				bw.write(words);
                bw.newLine();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(br != null){
				br.close();
			}
			if(bw != null){
				bw.flush();
				bw.close();
			}
		}
		return txtFile;
	}
}
