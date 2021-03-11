/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import gui.MyJButton;
import gui.MyJPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author User
 */
public class ChangeSkinListener implements ActionListener{
    //создаем переменные которые будем передавать в метод слушателя
    private LookAndFeel laf;
    private JFrame frame;
    
    public ChangeSkinListener(JFrame frame, LookAndFeel laf){
        this.frame=frame;
        this.laf=laf;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ChangeSkinListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(frame);
        
        
        }
    
    
    
    
}
