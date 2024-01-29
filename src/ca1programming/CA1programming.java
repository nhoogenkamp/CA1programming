/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Capitania
 */
public class CA1programming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt"));
            String name = br.readLine();
            String workLoad = br.readLine();
            String studentNum = br.readLine();

            while (name != null && workLoad != null && studentNum != null) {
                bw.write(studentNum + "-");

                String[] nameParts = name.split("\\s+");
                if (nameParts.length > 1) {
                    bw.write(nameParts[nameParts.length - 1]);
                } else {
                    System.out.println("Use a first and last name only");
                }
                bw.newLine();

                if (workLoad.matches("1")) {
                    bw.write("Very Light");
                } else if (workLoad.matches("2")) {
                    bw.write("Light");
                } else if (workLoad.matches("[3-5]")) {
                    bw.write("Part Time");
                } else if (workLoad.matches("[6-8]")) {
                    bw.write("Full Time");
                } else {
                    System.out.println("Please pick a number between 1-8 for the classes");
                }

                bw.newLine();

                // Read the next set of data for the next student
                name = br.readLine();
                workLoad = br.readLine();
                studentNum = br.readLine();
            }

            bw.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}