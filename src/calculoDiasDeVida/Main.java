/*
    1 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
meses e dias e mostre-a expressa em dias. Leve em consideração o ano com
365 dias e o mês com 30.
(Ex.: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */
package calculoDiasDeVida;

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
        int idade,meses,dias, idDias,calculoMeses,calculoDias;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos meses dede seu último aniversário"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dias dede seu último aniversário"));
        
       // Calculo mais adequado:
        idDias = (idade*365)+(meses*12)+dias;
        JOptionPane.showMessageDialog(null, idade+" anos, "+meses+" meses e "+dias+" dias = "+idDias+" dias de vida.");
// (Ex.: 3 anos, 2 meses e 15 dias = 1170 dias.)
        

// O QUE EU HAVIA FEITO:
    //  calculoMeses = (idade*12)+(meses);
    //  calculoDias = (calculoMeses*30)+(dias);
        
    // JOptionPane.showMessageDialog(null, idade+" anos, "+meses+" meses e "+dias+" dias = "+calculoDias+" dias de vida.");
    // JOptionPane.showMessageDialog(null,calculoDias+" dias");
    
    
    // TESTE DE COMMIT - PART. 2
    }
    
}
