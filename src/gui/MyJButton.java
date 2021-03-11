

package gui;

import javax.swing.JButton;


public class MyJButton extends JButton{
    // создаем два конструктора
    public MyJButton(String title){
    super.setText(title);
    }
    
    public MyJButton(String title, int width, int height){
    this(title); //берем эти параметры из первого конструкторар
    super.setSize(width, height);
    }

}
