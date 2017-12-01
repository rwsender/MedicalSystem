package medicalsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


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
}

