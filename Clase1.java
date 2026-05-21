/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg1;

import com.sun.source.tree.ParenthesizedTree;
import javax.swing.JOptionPane;

/**
 *
 * @author fabri
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
            // Vamos a iniciar con declaraciones tipo + identificador unico
            String variable1;
            
            //int variable1; esto es un error ya que no puedo tener dos variables iguales

            int variableUno; // Toda variable empieza en miniscula (camelCase)

            variable1="Esto es el valor que lleva este texto";
            
            double miData;

            miData=0.0;

            JOptionPane.showMessageDialog(null , variable1);
            
            //JOptionPane.showMessageDialog(null , miData) ; esto da error porque la variable no esta inicializada. 
            
            // buenas practicas, vamos a inicializar
            
            JOptionPane.showMessageDialog(null, "" + "");
            
            JOptionPane.showMessageDialog(null, "primer texto" + " segundo texto");
            
            JOptionPane.showMessageDialog(null, "primer texto" + "\n segundo texto");
            
            int edad=0;
            
            String edadString = "";
            
            edadString=JOptionPane.showInputDialog("Digita la edad para tomar alcohol");
            
            edad = Integer.parseInt(edadString);
            
            edad +=3;
            
            edadString +=3;
            
            JOptionPane.showMessageDialog(null, edad);
            
            JOptionPane.showMessageDialog(null, edadString);
            
            // Conversion de datos}
            
            
            

            
              

    }
  // if (1==1) esto genera error ya que esta afuerda de las llaves  
}
