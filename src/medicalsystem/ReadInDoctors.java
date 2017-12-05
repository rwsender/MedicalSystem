package medicalsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReadInDoctors {
    static String[][] doctor = new String[100][5];
    public void readIn() {
        try (BufferedReader br = new BufferedReader(new FileReader("AvailabilityUpdate.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(line);
    }
//  public static void readInDoctorInfo() throws FileNotFoundException{
//              Scanner sc = new Scanner(new File("DoctorRecordsFile.txt"));
//        List<String> lines = new ArrayList<String>();
//        while (sc.hasNextLine()) {
//            lines.add(sc.nextLine());
//            }
//
//        String[] arr = lines.toArray(new String[0]);
//        for(int i = 0; i < 5; i++){
//            System.out.println(lines.get(i).toString());
//        }
//        }
  public Object[][] readData() throws FileNotFoundException{
      System.out.println("ReadData has been called");
      Scanner sc = new Scanner(new File("DoctorRecordsFile.txt"));
      String line;
      int emptyFile = 0 ;
      
      int i = 0;
      int x = 0;
      while (sc.hasNextLine() == true) {
         // if (sc.hasNextLine()) {
                line = sc.nextLine();
            
                if ((!line.isEmpty())) {
                    doctor[i][x] = line;
                    System.out.println("stored at position i = " + i + " x = " + x);
                    System.out.println(doctor[i][x]);

                    x++;
                    emptyFile = 0;
                    
                } else {
                    System.out.println("PRE call emptyFile: " + emptyFile);
                    emptyFile++;
                    System.out.println("Post call emptyFile: " + emptyFile);
                    x = 0 ;
                    i ++;
                    System.out.println(doctor[0][3]);
                }
                    if (emptyFile >= 2) {
                        sc.close();
                 //   } else {
                        
                      
                    }
                //}
            
      }
      
      System.out.println("loop is over ");
      
      sc.close();
      return new Object[][]{doctor[0]};
  }
  public String getDataAsString(int x, int y){
      String data = doctor[x][y];
      return data;
  }
}
//}
