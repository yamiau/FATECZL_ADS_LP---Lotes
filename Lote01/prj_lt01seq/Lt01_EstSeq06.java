package prj_lt01seq;

/********************************************
Objetivo:       Receba os valores em x e y. Efetue a troca de seus valores e mostre seus conteúdos. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq06 {
    public static void main(String args[])
    {
        int X, Y, Z;
        
        Y = Integer.parseInt(JOptionPane.showInputDialog("X"));
        X = Integer.parseInt(JOptionPane.showInputDialog("Y"));
        
        
        JOptionPane.showMessageDialog(null, "X: " + X);
        JOptionPane.showMessageDialog(null, "Y: " + Y);
    } 
}