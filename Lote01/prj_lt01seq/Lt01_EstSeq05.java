package prj_lt01seq;

/********************************************
Objetivo:       Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possui 2 raízes). 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq05 {
    public static void main(String args[])
    {
        int A, B, C, D;
        double x1, x2;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Coeficiente A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Coeficiente B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Coeficiente C"));
        D = ((B * B)-(4 * A * C));
        
        if (D < 0) {
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais!");
        } else {
            x1 = ( ((-1 * B)+(Math.pow(D,0.5))) / (2 * A) );
            x2 = ( ((-1 * B)-(Math.pow(D,0.5))) / (2 * A) );
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + "; x2 = " + x2);
        }
    }
} 