package prj_lt01seq;

/********************************************
Objetivo:       quarto programa do lote
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq04 {
    public static void main(String args[])
    {
        double C, F;
        
        C = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em graus Celsius"));
        F = ((9 * C + 160) /5);
        
        JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + F);
    }
} 