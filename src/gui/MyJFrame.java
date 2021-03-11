

package gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyJFrame extends JFrame{

    //переменная для иконки
    private Image icon=new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
    
 //создаем два конструктора
    
    // первый конструктор принимает название фрейма, ширину и высоту
public MyJFrame(String title, int width, int height){
super(title); // передем название фрейма
super.setSize(width, height);// указываем рызмеры
super.setLocationRelativeTo(null); // расположение по центру
super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // указываем закрытие программы при закрытии окна
//super.setLayout(new GridLayout(3, 1, 5, 5));// указываем на тип менеджера 
//super.setVisible(true);// указывеам видимсоть по умолчанию
super.setIconImage(icon);// иконка для фрейма из пакета images
}

public MyJFrame(String title, int width, int height, Component comp){
this(title, width, height); //берем эти параметры из первого конструктора
super.getContentPane().add(comp);// можно указать компонент который сразу добавится на фрэйм
//super.setMinimumSize(new Dimension(500, 300));// установили минимальный размер для фрейма
}

        public MyJFrame(String name, int width, int height, LayoutManager layout ) {
        super(name);
        super.setSize(width, height);
        super.setLocationRelativeTo(null); // расположение по центру
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // указываем закрытие программы при закрытии окна    
        //this(name, width, height);
        super.setLayout(layout);
        super.setIconImage(icon);// иконка для фрейма из пакета images
        // super.setIconImage(new ImageIcon("calculator.png").getImage());// иконка для фрейма с диска с
     
    }
    
    

}
