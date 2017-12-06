/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeagenda;

/**
 *
 * @author NAMAN
 */
public class GestorDeAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemAgenda ia1=new ItemAgenda("Edrey Naaman Filio Marin", "2381694569", 75740);
        ItemAgenda ia2=new ItemAgenda("Jose Luis Romero Montalvo", "2381060216", 75764);
        //crear una agenda
        Agenda a1=new Agenda();
        a1.insertar(ia1);
        a1.insertar(ia2);
        //escribir el archivo
        a1.guardarAgenda("myAgenda.dat");
        //leer el archivo
        Agenda resAgenda=Agenda.leerAgenda("myAgenda.dat");
        
        System.out.println(resAgenda);
    }
    
}
