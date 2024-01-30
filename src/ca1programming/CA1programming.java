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

    /*
      Github link: https://github.com/nhoogenkamp/CA1programming
     */
    public static void main(String[] args) {
         try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt"));
            String name = br.readLine();
            String workLoad = br.readLine();
            String studentNum = br.readLine();
            String firstTwoDigits = studentNum.substring(0, 1);
            String lastChars = studentNum.substring(5);
            int lastNumbers = Integer.parseInt(lastChars);
            while (name != null && workLoad != null && studentNum != null) {
                

                if (studentNum.length() <6 ){
                    System.out.println("A student number has at least 6 digits ");
                }else if (!firstTwoDigits.matches("[2-9]")) {
                    System.out.println("Invalid year. Please ensure the year is at least 20 or later.");
                }else if (!studentNum.matches("\\d{1,2}[a-zA-Z]{1,2}\\S*\\d+")){
                    System.out.println("Invalid Studentnumber");    
                } else if (lastNumbers>=0 && lastNumbers<=200){
                    bw.write(studentNum + "-");
                }else{
                    System.out.println("The last digits of the student number cannot be greater than 200");
                }
                
                String[] nameParts = name.split("\\s+");
                 if (!nameParts[0].matches("[a-zA-Z]+")){
                System.out.println("Your first name can only be letters");
                }else if (nameParts.length > 1) {
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