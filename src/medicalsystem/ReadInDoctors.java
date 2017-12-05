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

    static String[][] doctor = new String[100][6];
    static String[][] availability = new String[100][7];

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
        while (sc.hasNextLine() == true) {

            line = sc.nextLine();

            if ((!line.isEmpty())) {
                doctor[i][x] = line;

                x++;
                emptyFile = 0;

            } else {
                emptyFile++;
                x = 0;
                i++;

            }
            if (emptyFile >= 2) {
                sc.close();
            }

        }


        sc.close();
        return new Object[][]{doctor[0]};
    }

    public String getDataAsString(int x, int y) {
        String data = doctor[x][y];
        return data;
    }
    
       public Object[][] readAvailability() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("AvailabilityUpdate.txt"));
        String line;

        int i = 0;
        int x = 0;
        
        while (sc.hasNextLine() == true) {

            line = sc.nextLine();

            while (x <= 7) {
                availability[i][x] = line;
                System.out.println("the value of i = " + i + "the value of x = " + x);
                System.out.println(availability[i][x]);
                x++;
                line = sc.nextLine();
            }
            i++;
        }
        if(sc.hasNextLine() == false) {
                sc.close();
            }


        sc.close();
        return new Object[][]{doctor[0]};
    }
}
