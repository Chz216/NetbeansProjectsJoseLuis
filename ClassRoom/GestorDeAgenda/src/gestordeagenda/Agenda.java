/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeagenda;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Agenda implements Serializable {

    public static final int MAX = 100;//las constantes siempre deben ir en mayusculas

    private ItemAgenda[] elArray;

    private int num;

    public Agenda() {
        elArray = new ItemAgenda[MAX];
        num = 0;
    }

    public void insertar(ItemAgenda ia) {
        elArray[num] = ia;//posicion
        num++;
    }
    
    public String toString(){
        String res = "";
        for (int i = 0; i <num; i++) {
            res += elArray[i] + "\n ";
            res += "================"+"\n ";
        }
        return res;
    }
    public void guardarAgenda(String fich){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fich)));
            oos.writeObject(this);
            oos.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"FILENOTFOUND" + ex.getMessage());
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null,"IOEXCEPTIO" + ex.getMessage());
        }
        
    }
    
    public static Agenda leerAgenda(String fich){
        Agenda aux= null;
        try {
            ObjectInputStream ois=new  ObjectInputStream(new FileInputStream(fich));
            aux =(Agenda) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"FILENOTFOUND" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"IOEXCEPTIO" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"CLASSNOTFOUND" + ex.getMessage());
        }
        return aux;
    }
    
    /*
    Escribir dos metodos de busqueda uno por nombre y otro por telefono .
    Ambas operaciones devolveran el primer ItemAgenda con la condicion
    que cumpla con la condicion en caso de que exista o null en caso de
    que no sea asi
    */
}
