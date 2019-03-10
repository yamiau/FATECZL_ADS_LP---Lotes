package prj_lt01seq;

/********************************************
Objetivo:       trigésimo-terceiro programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop33 {
    public static void main(String args[])
    {
        int n;
        double i, serie = 0;
        
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
                
        for (i = 1; i <= n; i++) {
            serie = ( serie + (1 / i) );
        }
        
        JOptionPane.showMessageDialog(null, serie);
    }
}
