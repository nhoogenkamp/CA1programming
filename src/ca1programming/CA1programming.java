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
 try{
            BufferedReader br = new BufferedReader( new FileReader("students.txt"));    
            BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt"));
            String name = br.readLine();
            String workLoad = br.readLine();
            String studentNum = br.readLine();
            bw.write(studentNum+"-");
            if (name != null) {
                String[] nameParts = name.split("\\s+");
                if (nameParts.length > 1) {
                    bw.write(nameParts[nameParts.length - 1]);
                } else {
                    System.out.println("Use a first and last name only");
                }
            
                 bw.close();

            }
    } catch (Exception e) {
            System.out.println(e);
    }
    }
}
    
