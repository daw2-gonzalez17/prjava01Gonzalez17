/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01gonzalez17;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ubu1-gonzalez
 */
public class Prjava01Gonzalez17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("fitxer01cognom17.html");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

            bw.write("<html>");bw.newLine();

            bw.write("  <head>");bw.newLine();

            bw.write("    <title>");bw.newLine();

            bw.write("      Nova p&agrave;gina  web de cognom17");bw.newLine();

            bw.write("    </title>");bw.newLine();

            bw.write("  </head>");bw.newLine();

            bw.write("  <body>");bw.newLine();

            bw.write("    Nova p&agrave;gina web de cognom17");bw.newLine();

            bw.write("  </body>");bw.newLine();

            bw.write("</html>");bw.newLine();

            bw.close();
    }   catch (IOException ex) {
            Logger.getLogger(Prjava01Gonzalez17.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
