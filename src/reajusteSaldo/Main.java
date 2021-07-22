/*
    3 - Informar um saldo e imprimir o saldo com reajuste de 1%.
 */
package reajusteSaldo;

import javax.swing.JOptionPane;

/**
 *
 * @author Nathan Fraga de Oliveira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldo;
        
        saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informar saldo"));
        JOptionPane.showMessageDialog(null,"Saldo atualizado em 1% é de: "+String.format("%,.2f", saldo * 1.01));
      
        
        
    }
    
}
