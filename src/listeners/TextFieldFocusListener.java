

package listeners;

import gui.Calculator;
import gui.MyJTextField;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class TextFieldFocusListener implements FocusListener{
        private MyJTextField field;

    public TextFieldFocusListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(Calculator.INP_CHISLO)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(Calculator.INP_CHISLO);
            field.setForeground(Color.GRAY);//цвет подсказок в слогаемых 
        }
    }

}
