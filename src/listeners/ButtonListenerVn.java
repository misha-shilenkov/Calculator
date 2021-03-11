

package listeners;

import calc.CalcOperations;
import gui.MyJTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ButtonListenerVn implements ActionListener {
//Реализация слушателчя на нажатие через внешний класс
// по лампочке нажимаем "реализовать все абстрактные методы" на ButtonListener    
   // private JPanel Pannel2;
    
    private MyJTextField jtxtInputCh1;
    private MyJTextField jtxtInputCh2;
    private MyJTextField jtxtRezultat;
    
    
    // создаем конструктор ButtonListenerVn и передаем в него  нужную панлеь в которой будет происходить дейсствие
    
    public ButtonListenerVn(MyJTextField jtxtInputCh1, MyJTextField jtxtInputCh2, MyJTextField jtxtRezultat){
        this.jtxtInputCh1=jtxtInputCh1;
        this.jtxtInputCh2=jtxtInputCh2;
        this.jtxtRezultat=jtxtRezultat;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Определяем какая кнопка была нажата
        if(!(e.getSource() instanceof JButton)){
            return;
        }
            /*
            Оператор instanceof используется для проверки того, 
            является ли объект экземпляром указанного типа. 
            (класс или подкласс или интерфейс). 
            instanceof также известен как оператор сравнения типов, 
            поскольку он сравнивает экземпляр с типом. 
            Он возвращает либо true, либо false.
            */
            
            
        JButton button=(JButton)e.getSource();
        
        final double a = Double.parseDouble(jtxtInputCh1.getText());
        final double b = Double.parseDouble(jtxtInputCh2.getText());

        if (button.getActionCommand().equals("Прибавить")) {
            jtxtRezultat.setText(String.valueOf(CalcOperations.add(a, b)));
        } else if (button.getActionCommand().equals("Разделить")) {
            jtxtRezultat.setText(String.valueOf(CalcOperations.divide(a, b)));
        } else if (button.getActionCommand().equals("Вычесть")) {
            jtxtRezultat.setText(String.valueOf(CalcOperations.subtract(a, b)));
        } else if (button.getActionCommand().equals("Умножить")) {
            jtxtRezultat.setText(String.valueOf(CalcOperations.multiply(a, b)));
        }
      }
    }
        
        
            
        
        
        
        
        
        /*
// проверка на условие какоя кнопка сработала
        String BtnSum="Прибавить";
        String BtnRazn="Вычесть";
        String BtnUmnog="Умножить";
        String BtnRazdel="Разделить";
        
            if (BtnSum==button.getText()) {
            JOptionPane.showMessageDialog(Pannel2, "Отработал Вариант 1. "+"Была нажата кнока "+button.getText()+". Реализация выполнена на базе слушателя на нажатие через внешний класс ButtonListenerVn");
            } 
            else if(BtnRazn==button.getText())
            {
            JOptionPane.showMessageDialog(Pannel2, "Отработал Вариант 2. "+"Была нажата кнока "+button.getText()+". Реализация выполнена на базе слушателя на нажатие через внешний класс ButtonListenerVn");
            }
            
            else if(BtnUmnog==button.getText()){
            
            JOptionPane.showMessageDialog(Pannel2, "Отработал Вариант 3. "+"Была нажата кнока "+button.getText()+". Реализация выполнена на базе слушателя на нажатие через внешний класс ButtonListenerVn");
            }
            else 
            {
            JOptionPane.showMessageDialog(Pannel2, "Отработал Вариант 4. "+"Была нажата кнока "+button.getText()+". Реализация выполнена на базе слушателя на нажатие через внешний класс ButtonListenerVn");
            }
        */

    


