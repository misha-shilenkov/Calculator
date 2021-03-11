
package gui;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import listeners.ButtonListenerVn;
import listeners.ChangeSkinListener;
import listeners.TextFieldFocusListener;
import net.infonode.gui.laf.InfoNodeLookAndFeel;

public class Calculator {
    //создаем переменные для кажлдой кнопки/текста/поля ввода а так же для панелей и для фрейма
    
    public static final String INP_CHISLO="Введите число";
    
    private MyJButton BtnSum;
    private MyJButton BtnRazn;
    private MyJButton BtnUmnog;
    private MyJButton BtnRazdel;
    private MyJButton BtnDefaultSkin;
    private MyJButton BtnChangeSkin;
    
    private JLabel labelCh1;
    private JLabel labelCh2;
    private JLabel labelChRezult;
    
    private MyJTextField jtxtInputCh1;
    private MyJTextField jtxtInputCh2;
    private MyJTextField jtxtRezultat;
    
    
    private MyJPanel Pannel1;
    private MyJPanel Pannel2;
    private MyJPanel Pannel3;
    

    
    private MyJFrame frame;
    
    
    
    public static void main(String[] args) {
        
        
        
       try {
            //применим скин для вкомпоненты внутри фрейма
            //try cetch строится автоматически через лампочку
            //UIManager.getSystemLookAndFeelClassName() - скин, внутренние компоненты внутри фрейма - оформление под систему
            //"com.sun.java.swing.plaf.motif.MotifLookAndFeel" - скин, готовый класс в джаве
            // new MetalLookAndFeel() - скин, готовый объект
            //new HiFiLookAndFeel()- скин, скчаный с нета jar файл, подключается вручную в библиотеку в дереве и после прописывается в коде
            
            
            UIManager.setLookAndFeel(new AeroLookAndFeel());//HiFiLookAndFeel-один из вариантов из библиотеки
        } 
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                 // Применим скин для наружныйх элементов фрейма(самого окна)
         JFrame.setDefaultLookAndFeelDecorated(true);
        
         Calculator calculator = new Calculator();
         
         
         calculator.createJLable();//создали метод по созданию текстов
         calculator.createTextField();//создали метод по созданию поля ввода текстов
         calculator.createButtons();//создали метод по созданию кнопок
         calculator.createJPannel();//создали метод по созданию панелей
         calculator.createJFrame();//создали метод по созданию фреймов
     
         
         
    }
    

    
             //вызываем метод по созданию текстов
         public void createJLable(){
            labelCh1=new JLabel("Число1");
            labelCh2=new JLabel("Число2");
            labelChRezult=new JLabel("Результат");
         }
    
     //вызываем метод по созданию поля ввода текстов
         public void createTextField(){
    jtxtInputCh1=new MyJTextField(INP_CHISLO, 10); //INP_CHISLO
    jtxtInputCh2=new MyJTextField(INP_CHISLO, 10); //INP_CHISLO
    
    jtxtRezultat=new MyJTextField(15, Color.BLACK);
    jtxtRezultat.setEditable(false); // нельзя редактировать текстовое поле
    jtxtRezultat.setFocusable(false);//нельзя навестись курсором на текстоове поле
    
    addTextFieldListeners();
         }
    
         
         
    // вызываем метожд по созданиюб кнопок
    // создаем кнопки с помощьюд конструтора MyJButton, созданного ранее в классе MyJButton
        public void createButtons(){
        BtnSum=new MyJButton("Прибавить");
        BtnRazn=new MyJButton("Вычесть");
        BtnUmnog=new MyJButton("Умножить");
        BtnRazdel=new MyJButton("Разделить");
        BtnDefaultSkin=new MyJButton("Скин по умолчанию");
        BtnChangeSkin=new MyJButton("Сменить скин");
        
        addButtonListeners();
       
  
        
         }
        
          //вызываем метод по созданию панелй         
        public void createJPannel(){
            
            // создаем панели
   
            
                Pannel1=new MyJPanel("Pannel1", 100, 100);
                Pannel1.setPreferredSize(new Dimension(100,100));
                Pannel1.setLayout(new FlowLayout(FlowLayout.LEFT));
                
                               
                Pannel2=new MyJPanel("Pannel2", 100, 100);
                Pannel2.setPreferredSize(new Dimension(200,50));
                Pannel2.setLayout(new FlowLayout(FlowLayout.LEFT));
                
                
                Pannel3=new MyJPanel("Pannel3", 100, 100);
                Pannel3.setPreferredSize(new Dimension(200,50));
                Pannel3.setLayout(new FlowLayout(FlowLayout.LEFT));
                
                //Добавляем элемекнты на панели
              
                
                Pannel1.add(labelCh1);
                Pannel1.add(jtxtInputCh1);
                Pannel1.add(labelCh2);
                Pannel1.add(jtxtInputCh2);  
               
                
                
                Pannel2.add(BtnSum);
                Pannel2.add(BtnRazn);
                Pannel2.add(BtnUmnog);
                Pannel2.add(BtnRazdel);
                
                Pannel3.add(labelChRezult);
                Pannel3.add(jtxtRezultat);    
                Pannel3.add(BtnDefaultSkin);
                Pannel3.add(BtnChangeSkin);
                
               
        }        
        

                  
        //вызываем метод по созданию фреймов
        public void createJFrame(){
            frame=new MyJFrame("Калькулятор", 500, 280, new BorderLayout(2, 2));
            frame.setMinimumSize(new Dimension(500, 280)); // минимальный размер окна
            
            //добавляем панели во фрейм
            

            frame.getContentPane().add(Pannel1, BorderLayout.NORTH);
            frame.getContentPane().add(Pannel2, BorderLayout.CENTER);
            frame.getContentPane().add(Pannel3, BorderLayout.SOUTH);
            

            frame.setResizable(false); // запрет на изменение размерв окна
            
            addChangeSkinListener(); // добавили использование метода слушателя по смене скинов
            frame.setVisible(true);
            
            
        }
        
        
         
         // слушатели
       private void addButtonListeners(){
       ButtonListenerVn b1=new ButtonListenerVn(jtxtInputCh1, jtxtInputCh2, jtxtRezultat);
       
        BtnSum.addActionListener(b1);
        BtnRazn.addActionListener(b1);
        BtnUmnog.addActionListener(b1);
        BtnRazdel.addActionListener(b1);
       
         }
         
         private void addTextFieldListeners(){
       jtxtInputCh1.addFocusListener(new TextFieldFocusListener(jtxtInputCh1));
       jtxtInputCh2.addFocusListener(new TextFieldFocusListener(jtxtInputCh2));
         }
         
         private void addChangeSkinListener(){
        BtnChangeSkin.addActionListener(new ChangeSkinListener(frame, new InfoNodeLookAndFeel())); //HiFiLookAndFeel(), MetalLookAndFeel(),InfoNodeLookAndFeel
        BtnDefaultSkin.addActionListener(new ChangeSkinListener(frame, new AeroLookAndFeel()));
         }



         
                 
    }     

                 
      
       
         

    

