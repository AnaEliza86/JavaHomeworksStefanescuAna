/*
 *FilesManagement class having four methods
 */
package javahomeworksstefanescuana;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana-Eliza
 */
public class FilesManagement {
    public static void main(String[] args){
                //write a string into a file specified as parameter
        try{
            File file = new File("test1.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This\n is\n ");
            fileWriter.write("an\n example\n");
            fileWriter.flush();
            fileWriter.close();
            FileReader fr = new FileReader(file); 
            char [] a = new char[50];
            fr.read(a);
            for(char c : a)
         System.out.print(c);   
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
                //to read, if exists, the whole content of a specified file as parameter into a string
        try{
            File file = new File("test.txt");
            StringBuilder stringBuilder;
            try (FileReader fileReader = new FileReader(file)) {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                stringBuilder = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                }   }
            System.out.println("Contents of file:");
            System.out.println(stringBuilder.toString());
    }   catch (IOException ex) {
            ex.printStackTrace();
        }
        
                // delete a content of a specified file as parameter
        File f = null;
        boolean bool = false;
            
      f = new File("test.txt");
      bool = f.delete();
      System.out.println("File deleted: "+bool);
          try {
              f.createNewFile();
              System.out.println("createNewFile() method is invoked");
              bool = f.delete();
              System.out.println("File deleted: "+bool);
              
          } catch (IOException ex) {
              ex.printStackTrace();
          }
          //to add a string content into an empty file specified as parameter
          
         String FILENAME = "D:\\test\\filename.txt";
    
     
        BufferedWriter bw = null;
        FileWriter fw = null;
                
            String data = " This is new content";

            File file = new File(FILENAME);
            
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(data);

			System.out.println("Done");

                } catch (IOException ex) {
                    ex.printStackTrace();
                }finally{
                    
			try{
                            if(bw !=null)
                                bw.close();
                            if(fw !=null)
                                fw.close();
                        } catch (IOException ex) {
                        ex.printStackTrace();
                    }
    }
}
    }
}
        