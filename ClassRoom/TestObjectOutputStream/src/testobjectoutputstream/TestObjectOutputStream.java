/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjectoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NAMAN
 */
public class TestObjectOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CREATE AN OUTPUT STREAM FOR THE FILE
            ObjectOutputStream output;
        try {
            output = new ObjectOutputStream(new FileOutputStream("Object.dat"));
            
            output.writeUTF("Jose Luis Romero Montalvo");
            output.writeDouble(76.8);
            output.writeObject(new Date());
            //close output stream
            output.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,("Ther is an error of Not Found")+ ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,("Ther is of IO")+ ex.getMessage());
        }
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Object.dat"));
            
            String name = input.readUTF();
            double weight = input.readDouble();
            Date date = (Date)input.readObject();
                    
            System.out.println(" name " + name+ " weight " +weight+ "date" +date );       
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,("Ther is an error of Not Found")+ ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,("Ther is an error of IO")+ ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
