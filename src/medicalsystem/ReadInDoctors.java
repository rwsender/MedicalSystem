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
  public static void readInDoctorInfo() throws FileNotFoundException{
              Scanner sc = new Scanner(new File("DoctorRecordsFile.txt"));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
            }

        String[] arr = lines.toArray(new String[0]);
        for(int i = 0; i < 5; i++){
            System.out.println(lines.get(i).toString());
        }
        }
  public static void readData() throws FileNotFoundException{
      Scanner sc = new Scanner(new File("DoctorRecordsFile.txt"));
      int i = 0;
      int x = 0;
      String[][] doctor = new String[100][5];
      while (sc.hasNext() == true){
      if (sc.hasNextLine() == true){
          doctor[i][x] = sc.nextLine();
          x++;
      }
      else{
          i++;
      }
  }
      for(int y = 0; y < doctor[1].length; y++){
      System.out.println(doctor[1].length);
      System.out.println(doctor[1][y]);
  } 
  }
  }

