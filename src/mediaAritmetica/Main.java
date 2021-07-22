/*
    2 - Fazer um programa que imprima a média aritimética dos números 8,
    9, e 7. A média dos números 4,5 e 6. A soma das duas médias. A média
    das médias.
 */
package mediaAritmetica;

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
        double m1, m2, soma, mg;

        m1 = (7 + 8 + 9) / 3;
        m2 = (4 + 5 + 6) / 3;
        soma = m1 + m2;
        mg = soma / 2;

        System.out.println("A média do primeiro sistema é: " + m1);
        System.out.println("A média do segundo sistema é: " + m2);

        System.out.println("A soma geral do sistema é: " + soma);
        System.out.println("A média geral do sistema é: " + mg);

    }

}
