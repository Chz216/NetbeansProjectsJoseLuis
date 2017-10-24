package readfileusingfilechooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;//muestra el cuadro de dialogo de exploracion de archivos
import javax.swing.JOptionPane;

public class ReadFileUsingFileChooser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser fileChooser=new JFileChooser();
        if (fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            //Get the selected File
            File file=fileChooser.getSelectedFile();
            try {
                //Create a Scanner for the file;
                Scanner input = new Scanner(file);
                //Read text from the file
                int count = 0;
                //Read text from the file
                while (input.hasNext()) {
                    System.out.println(input.next());
                    count++;
                    JOptionPane.showMessageDialog(null, " Total de palabras es: " +count);
                }
                input.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "No file selected");
        }
    }

}
