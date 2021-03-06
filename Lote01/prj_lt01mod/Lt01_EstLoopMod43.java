package prj_lt01mod;

/********************************************
Objetivo:       Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano. 
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod43 {
    public static void main(String args[])
    {
        double Ana, Maria;
        
        JOptionPane.showMessageDialog(null, "Ana mede 1.1m e cresce 3cm por ano. Maria mede 1.5m e cresce 2cm por ano.");
        
        Ana = 1.1;
        Maria = 1.5;
        
        crescimento(Ana, Maria);
    }

    static void crescimento(double Ana, double Maria)
    {
        int anos = 0;
        
        while (Maria > Ana) {
            anos++;
            Ana += 0.03;
            Maria += 0.02;
        }
        
        JOptionPane.showMessageDialog(null, "Ana será mais alta que Maria após " + anos + " anos.");
    }
}
