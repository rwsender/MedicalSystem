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

/**
 *
 * @author user
 */
public class AddNewDoctor {
//
//public static void save(String s) {
//
//        try (FileWriter fw = new FileWriter("DoctorRecordsFile.txt", true); //creates a new filewriter, true is for appending files so the data is not overwritten
//                BufferedWriter bw = new BufferedWriter(fw);
//                PrintWriter out = new PrintWriter(bw)) {
//            out.println(s);
//        } catch (IOException e) {
//            System.out.println("IOExeption: " + e);
//        }
//}

    public void saveCert(String docName, String contactID, String contactAddress, String contactMethod, String medicalDispline, String certDate) {

        try (FileWriter fw = new FileWriter("DoctorRecordsFile.txt", true); //creates a new filewriter, true is for appending files so the data is not overwritten
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println(docName);
            out.println(contactID);
            out.println(contactAddress);
            out.println(contactMethod);
            out.println(medicalDispline);
            out.println(certDate);
            out.println("");
        } catch (IOException e) {
            System.out.println("Save failed");
        }

    }
        public void save(String docName, String contactID, String contactAddress, String contactMethod, String medicalDispline) {

        try (FileWriter fw = new FileWriter("DoctorRecordsFile.txt", true); //creates a new filewriter, true is for appending files so the data is not overwritten
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println(docName);
            out.println(contactID);
            out.println(contactAddress);
            out.println(contactMethod);
            out.println(medicalDispline);
            out.println("");
        } catch (IOException e) {
            System.out.println("Save failed");
        }

    }
}
