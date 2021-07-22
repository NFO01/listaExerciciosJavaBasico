/*
    5 - Crie um algoritmo que leia o valor do salário mínimo e o valor do
salário de um usuário, calcule a quantidade de salários mínimos esse usu_
ário ganha e imprima o resultado (1SM = 1.087,85
 */
package salarioMinimo;

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
       double salMinimo, salUser, result;
       
       salMinimo = Double.parseDouble(
               JOptionPane.showInputDialog("Informe o valor do salário mínimo"));
       
       salUser = Double.parseDouble(
               JOptionPane.showInputDialog("Informe o valor do seu salário"));
       
       result = salUser/salMinimo;
        JOptionPane.showMessageDialog(null, String.format("%,.1f", result) +
        "SM=R$" + String.format("%,.2f",salUser));
               
               }
    
}
