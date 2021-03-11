

package gui;

import java.awt.Dimension;
import java.awt.Font;
import javafx.scene.paint.Color;
import javax.swing.JTextField;


public class MyJTextField extends JTextField{

    public MyJTextField(String text, int columns) {
        //конструктор
        this(columns);
        super.setText(text);
        
        
    }
    
        public MyJTextField(int columns) {
        
        super.setColumns(columns);
        Font font=new Font("Arial", Font.ITALIC, 12); //ITALIC
        super.setFont(font);
        super.setForeground(java.awt.Color.GRAY); // изначальный цвет подсказок 
        
    }
    
        public MyJTextField(int columns, Color textColor) {
        
        super.setColumns(columns);
        Font font=new Font("Arial", Font.ITALIC, 12); //ITALIC. Courier
        super.setFont(font);
        super.setForeground(java.awt.Color.BLACK); //Цвет результата
        
        
    }


    

}
