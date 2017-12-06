/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writereadobject;

import java.io.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class WriteReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Writes an object a binary file 
        ObjectOutputStream fileOut;
        TestObject obj = new TestObject(1, "test1", 2);
        String fileName = JOptionPane.showInputDialog(null, "Enter the file´s name");

        try {
            fileOut = new ObjectOutputStream(new FileOutputStream(fileName));
            fileOut.writeObject(obj);
            fileOut.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FileNotFound" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IoException" + ex.getMessage());
        }
        //End write

        TestObject objIn;
        try {
            //Read object a binary file
            ObjectInputStream fileInt = new ObjectInputStream(new FileInputStream(fileName));
            objIn = (TestObject) fileInt.readObject();
            objIn.display();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FileNotFound" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IoException" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ClassNotFound" + ex.getMessage());
        }
    }
}
