/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextappsistema;

import Views.frmLogin;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
//import com.formdev.flatlaf.FlatLightLaf;
//import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author mdeodanes
 */
public class NextappSistema {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());

            frmLogin iframe = new frmLogin();

            iframe.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Look and feel no soportado" + ex.getMessage());
        }

    }

}
