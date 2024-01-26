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
            String data = br.readLine();
            String workLoad = br.readLine();
            String studentNum = br.readLine();

                 BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt"));
                 bw.write(data+","+workLoad+","+studentNum);
                 bw.close();

    
    } catch (Exception e) {
            System.out.println(e);
    }
    }
}
    
