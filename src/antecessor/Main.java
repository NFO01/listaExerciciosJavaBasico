/*

 */
package antecessor;

import javax.swing.JOptionPane;

/**
 *
 * @author 182110024
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
      numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um número inteiro"));
      JOptionPane.showMessageDialog(null, "Antecessor é: "+(numero-1) + 
              "\n Número digitado foi: "+ numero + "\n Número sucessor é: "+ (numero+1));
    }
    
}
