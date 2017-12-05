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

    static String[][] doctor = new String[100][6]; //creating new 2D doctor array

    public void readIn() {
        try (BufferedReader br = new BufferedReader(new FileReader("AvailabilityUpdate.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Object[][] readData() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DoctorRecordsFile.txt"));
        String line;
        int emptyFile = 0;

        int i = 0;
        int x = 0;
        while (sc.hasNextLine() == true) { //while a new line is avaialble

            line = sc.nextLine(); //read in a new line

            if ((!line.isEmpty())) { //if the line isn't empty
                doctor[i][x] = line; //assign line(scanner input) to pos in array

                x++;
                emptyFile = 0; //set empty file to 0

            } else {
                emptyFile++; 
                x = 0;
                i++;

            }
            if (emptyFile >= 2) { //if empty file is >3 it means you have reached the end of the file
                sc.close(); //close the scaanner
            }

        }


        sc.close();
        return new Object[][]{doctor[0]};
    }

    public String getDataAsString(int x, int y) { //method used for searching data from positions within doctor 2D array
        String data = doctor[x][y];
        return data;
    }
    
}
