package prj_lt01seq;

/********************************************
Objetivo:       trigésimo-nono programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop39 {
    public static void main(String args[])
    {
        int casa, qt = 0;
        
        casa   = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de casas no tabuleiro"));
        
        for (int i = 0; i < casa; i++) {
            qt = (int)(Math.pow(2, i));
        }
        
        JOptionPane.showMessageDialog(null, "Quantidade de grãos: " + qt);
        
        }
    }
