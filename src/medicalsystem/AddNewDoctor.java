/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class AddNewDoctor {
        public void save(Array DoctorArray) {

//        try (FileWriter fw = new FileWriter("DoctorRecordFile.txt", true); //creates a new filewriter, true is for appending files so the data is not overwritten
//                BufferedWriter bw = new BufferedWriter(fw);
//                PrintWriter out = new PrintWriter(bw)) {
//            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//            Calendar calobj = Calendar.getInstance();
//
//            out.println(df.format(calobj.getTime())); //uses the df format for pringing a date and time, and calander to get the info
//            out.println(doctorName); //prints out the doctors name
//            out.println(doctorAddress); 
//            out.println(contactMethod); 
//            out.println(contactID); 
//            out.println(medicalDisipline); 
//            out.println(" ");
//        } catch (IOException e) {
//            System.out.println("Saving failed");
//        }

    }

    void save(String[] Doctor) {
        try
{
    PrintWriter pr = new PrintWriter("DoctorRecordFile.txt");    

    for (int i=0; i < 1; i++)
    {
        pr.println(Doctor);
    }
    pr.close();
}
catch (Exception e)
{
    e.printStackTrace();
    System.out.println("No such file exists.");
}
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
