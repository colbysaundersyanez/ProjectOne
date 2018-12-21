import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Scanner;
import java.util.*;
import java.rmi.*;
import java.awt.event.ActionListener;
import java.awt.Button;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.datatransfer.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

class frameGraphics extends Frame{
   public static JPanel x = new JPanel();
   public static textBox showBox = new textBox();
   
   public frameGraphics(){
      super("ChatBot");
      setSize(300,600);
      setVisible(true);
      setBackground(Color.gray);
      x.setSize(300,600);
      x.setLayout(null);
      add(x);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.out.println("closing");
            System.exit(0);
         }        
      }); 
   }
   
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(Color.white);
      g2.fillRect(10,35,279,475);
      Graphics2D g3 = (Graphics2D) g;
      Font font = new Font("Serif" , Font.BOLD, 26);
      g3.setColor(Color.black);
      g3.setFont(font);
      g3.drawString("ChatBot", 95, 60); 
      g3.drawLine(97,65,188,65);
     // g3.setFont(new Font("default", Font.BOLD, 16)); 
   }
   
   public static void main(String[] args){
      frameGraphics testing = new frameGraphics();
      secondMainClass.mainMethod();
   }
}

class secondMainClass extends frameGraphics{
   public static textBox showBox = new textBox();
   public static void mainMethod(){
      test t = new test();
      t.buttonCreator(x,2,487,75,30,"Enter");
      showBox.textBoxCreator(x,1,520,278,32);
   }
}




//Button b = new Button("testing");
      //b.setBounds(2,487,75,30);
      //x.add(b);
      
      ///https://www.mkyong.com/awt/java-awt-drawing-rectangle-line-and-circle/
      
//g.setColor(Color.white);
     
      //f.setColor(Color.white);
      //f.drawRect(10,35,278,475);
      //f.fillRect(10,35,278,475); 