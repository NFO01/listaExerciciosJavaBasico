/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentagemIpi;

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
        double valor1, valor2,ipi, result;
        int cod1, cod2, qtd1, qtd2;
       
       ipi = Double.parseDouble( 
               JOptionPane.showInputDialog(null, "Informe o % de IPI:"));
       
      JOptionPane.showInputDialog(null,"Informe o código do produto 1 ");
      
      valor1 = Double.parseDouble( 
               JOptionPane.showInputDialog(null, "Informe o valor do produto 1:"));
      qtd1 = Integer.parseInt( 
              JOptionPane.showInputDialog(null, "Informe a quantidade do produto 1:"));
      JOptionPane.showInputDialog(null,"Informe o código do produto 2 ");
      valor2 = Double.parseDouble( 
              JOptionPane.showInputDialog(null, "Informe o valor do produto 2:"));
      qtd2 = Integer.parseInt( 
             JOptionPane.showInputDialog(null, "Informe a quantidade do produto 2:"));
      
      result = (valor1*qtd1 + valor2*qtd2)*(ipi/100+1);
      JOptionPane.showMessageDialog(null,"O valor final é: "+ String.format("%,.2f", result));
    }
}























