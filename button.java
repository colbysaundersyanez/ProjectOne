import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.util.*;
import java.rmi.*;
import java.awt.Button;
import javax.swing.*;
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
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Label;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.ButtonGroup;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Random; 

class button implements ActionListener{

   //list of things to add:
   //response for bot with scanner class in the methods responsable for it
   //scrolling(not going to happen in the near future)
   //replacing the rectangle with some kind of jpanel or integrate it into the jpanel so they have the same size
   //add in more responses and scenerios into the bot
   //perhaps sub branch into other speech options if the bot does not know how to respond
   //asking questions to the user and creating a new response paper
   //figuring a way to implement this without having hundreds of single page responses
   //perhaps using a chatbot framework if my idea doesnt work
   //make the chatbot look more "modern"
   //organize code and perhaps rebuild in a seperate file
   //implement the ability to launch programs from the bot
   //upload to github and make an applicataion/exe
   //add the ability to look up things on the internet (have code on screenshot, (phone although it is
   //bash script and perhaps it would be better to use something like java.net although I have to figure
   //out how to get the data from the search results and print it out in text format from the seatch engine)
   
   
   //https://stackoverflow.com/questions/6159118/using-java-to-pull-data-from-a-webpage
   
   public JPanel buttonCreator(JPanel f, int a, int b, int c, int d, String name){
      System.out.println("button created");
      Button g = new Button(name);
      g.setBounds(a,b,c,d);
      g.addActionListener(this);
      g.setVisible(true);
      f.add(g);
      return f;
      }
      
   public void actionPerformed(ActionEvent e){System.out.println("ButtonWithNoClass");}
   }
   
   class closeButton extends button implements ActionListener{
      public void actionPerformed(ActionEvent e){System.exit(0);}
   }
   
   class resetButton extends button implements ActionListener{
      public void actionPerformed(ActionEvent e){subReset.mainReset();}
      static class subReset extends frameGraphics{
         public static void mainReset(){
            System.out.println("Reset Button not working");
            frameGraphics testingTwo = new frameGraphics();
         }
      }
   }
   
   class test extends button implements ActionListener{
      public static File file = new File("hellotesting.txt");
      public static ArrayList store = new ArrayList<String>();
      public static ArrayList <String> store1 = new ArrayList();
      public static ArrayList store2 = new ArrayList();
      public static ArrayList<String> storedWords = new ArrayList<String>();
      public static Font myF = new Font("Serif",Font.BOLD,14);
      public void actionPerformed(ActionEvent e){store.add(1);nestedClass.nestedMethod();}
      static class nestedClass extends textBox{
         public static void nestedMethod(){nestedClassTwo.nestedMethodTwo();}
         static class nestedClassTwo extends secondMainClass{
            public static void nestedMethodTwo() {
            
                  //may have to have a scanner method in order to determine what n1 is saying
                  //then I can determine the bot's response. 
                  //get scanner info
                  //then make it a string/arraylist variable that is equal to the file and then
                  //add to the long class method for fileoutputstream. 
                  
               try{
                  String n1 = textBox.getTextBox(showBox);
                  //System.out.println("testing:" + n1);
                  store1.clear();
                  //store2.add(1);
                  store1.add(n1);
                  //System.out.println(store1);
                  File filehello = new File("hellotesting.txt");
                  File filehellobot = new File("hellobot.txt");
                  File howAreYou = new File("howAreYou.txt");
                  helloMethod();
                  methodScanner(filehello , howAreYou, n1);
                  System.out.println("scanner example: " + ScannerExample.mainBotPrinter(howAreYou));
                  //fileOutputStream.secondClassExtends.fileOutputStreamImported.mainMethodFile(filehello,n1);
                  
              }
               catch(FileNotFoundException e){e.printStackTrace();}
            }
            //moved the changeStr code into that method and now it does not print the correct statement(think this is fixed)
            public static void methodScanner(File one, File two, String string){
                 File responsesFile = new File("responses.txt");
                 File filehellobot = new File("hellobot.txt");
                 try{
                   if(changeStr(two).contains(string)){
                     printerMethodClass.printerMethodClassTwo.showingMethod(responsesFile);
                   }
                   if(changeStr(one).contains(string)){
                     printerMethodClass.printerMethodClassTwo.showingMethod(filehellobot);
                   }
                   else{
                     Label t = new Label("Bot:I Don't Understand");
                     printerMethodCreator.printerMethodCreatorTwo.pMethod(500,60,t,myF,5,250,20,0,195,0,x);
                   }
                 
                   System.out.println("store" + store.size());
                   for(int i = 0; i<=37; i++){store.add(1);} 
                  
                 }
                 catch(FileNotFoundException ex){
                     ex.printStackTrace();
                 }
              }
              
            public static String changeStr(File file){
                  FileInputStream fis = null;
                  String str = "";
                  try {
                     fis = new FileInputStream(file);
                     int content;
                     while ((content = fis.read()) != -1) {
                     str += (char) content;
                     }

                  } catch (IOException e) {
                     e.printStackTrace();
                  } finally {
                     try {
                        if (fis != null)
                           fis.close();
                   } catch (IOException ex) {
                     ex.printStackTrace();
                  }
               }
               System.out.println(str);
               return str;
            } 
 
            public static void helloMethod(){
               int loc = 40+store.size();
               Label personPrint = new Label("You: " + store1.get(0));
               personPrint.setFont(myF);
               personPrint.setBounds(5,loc,250,20);
               personPrint.setVisible(true);
               personPrint.setBackground(Color.WHITE);
               Color myCustomColor = new Color(200,0,0);
               personPrint.setForeground(myCustomColor);
               x.add(personPrint);
            }
         }
      }
   }
   
class fileOutputStream {
    public static class secondClassExtends extends frameGraphics{
    public static class fileOutputStreamImported extends test{
        public static void mainMethodFile(File file, String g){
        ArrayList<String> testing = new ArrayList<String>();
        ArrayList<String> testingOne = new ArrayList<String>();
        FileInputStream fis = null;
        String str = "";
        try {
            fis = new FileInputStream(file);
            int content;
            while ((content = fis.read()) != -1) {
                str += (char) content;
            }
            System.out.println("this is the str:" + str);
            for(String word:str.split(" ")){store2.add(word);}
            //if(str.contains(g)){printerMethodClass.extendingMethod();} //this needs to be fixed. (somewhat fixed)
            //else{
            //Label t = new Label("Bot: I Don't Understand");
            //printerMethodCreator.printerMethodCreatorTwo.pMethod(500,60,t,myF,5,250,20,0,195,0,x);
            //}
            for(int i = 0; i<=37; i++){store.add(1);}
        }
         
      catch (IOException e) {e.printStackTrace();}
       
      finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
               }
            }
         }
      }
      
      }
    }
   
class scannerFile extends test{
   public static void scannerMethod() throws FileNotFoundException{scannerFileTwo.testingPrinting();}
   static class scannerFileTwo extends frameGraphics{
      public static void testingPrinting() throws FileNotFoundException{
         Scanner s = new Scanner(new File("hellotesting.txt"));
         ArrayList<String> list = new ArrayList<String>();
            while (s.hasNext()){
               list.add(s.next());  
            }
            s.close();
            if(list.get(0).contains(store1.get(0))){System.out.println("scannerFile works");}
            else{System.out.println("testtingPrinting() not working");}
      }
   }
}

class printerMethodClass extends test{
   //public static void extendingMethod() throws FileNotFoundException{printerMethodClassTwo.showingMethod();}
   public static class printerMethodClassTwo extends frameGraphics{
       public static void showingMethod(File file) throws FileNotFoundException{
         //File file = new File("hellobot.txt");
         Label machinePrint = new Label("Bot: " + ScannerExample.mainBotPrinter(file));
         System.out.println(store.size());
         printerMethodCreator.printerMethodCreatorTwo.pMethod(500,60,machinePrint,myF,5,250,20,0,195,0,x);
       }
   }
}

class printerMethodCreator extends test{
   static class printerMethodCreatorTwo extends frameGraphics{
      public static JPanel pMethod(int time, int loc, Label u,Font font,int a, int d, int c, int r, int b, int g, JPanel panel) throws FileNotFoundException{
         try{
            Thread.sleep(time);
            int y = loc+store.size();
            u.setFont(font);
            u.setBounds(a,y,d,c);
            u.setVisible(true);
            u.setBackground(Color.WHITE);
            Color myCustomColorT = new Color(r,g,b);
            u.setForeground(myCustomColorT);
            panel.add(u);
         }
         catch(InterruptedException ex){
            Thread.currentThread().interrupt();
         }
         return panel;   
      }
   }
}

class ScannerExample {
    public static String mainBotPrinter(File file) throws FileNotFoundException {
        Scanner s = new Scanner(file);
        ArrayList<String> listScanner = new ArrayList<String>();
            while (s.hasNext()){
               listScanner.add(s.next());  
            }
            s.close();
        return listScanner.get(returnRandom(listScanner.size()-1,0));
    }
    public static int returnRandom(int max, int min){
      Random rand = new Random();
      int n = rand.nextInt(max)+min;
      return n;
    }   
}
       
   
//LEFT OVER CODE THAT MIGHT BE USED IN FUTURE.
   
               //for(int i = 0; i<=37; i++){store.add(1);}

 //else{System.out.println("NotWorking");}
            //}

               //if(n1.contains(file)){helloMethod(); showingMethod();
               //for(int i = store.size(); i<0 ;n++){
               //   for(int loops = 0; n<=1000;loops++){
               //      System.out.println(adding);
               //   }
               //}
               
               
                              //System.out.println("Method Working");
               //System.out.println(store.size());
               //System.out.println(adding);
               
          // public static ArrayList<String> getAllLines(File file) throws FileNotFoundException, IOException {
              // FileReader fr = new FileReader(file);
               ///BufferedReader br = new BufferedReader(fr);
              // String buffer;
              // String fulltext="";
              // while ((buffer = br.readLine()) != null) {
               //System.out.println(buffer);
              // fulltext += buffer;
              // }
               //br.close();
               //fr.close();
               //return ;
          //}
          
          
          
                 //        try{
                 // String str = "";
                 // FileInputStream fis = null;
                 // fis = new FileInputStream(file);
                 // int content;
                 /// while ((content = fis.read()) != -1) {
                 //    str += (char) content;}
                 // storedWords.add(str);
                  //System.out.println(storedWords);
               //}
               //catch(IOException e){
              //    e.printStackTrace();
              // }
              
              
              
                             //System.out.println(readAllLines(filehello));
               //String f = readAllLines(filehello).toString();
               //System.out.println(f);
               //String hj = storedWords.get(0);
               //System.out.println(hj);
               
                             //String f = filehello;
                             
                             
            //public static String[][] readAllLines(File file) {
               //String[][] result = new String[3][];
                  //try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                     //for (String current = reader.readLine(); current != null; current = reader
                        //.readLine()) {
                        //int line = 0;
                        //line++;
                        //System.out.println(line);}
                 // } catch (IOException e) {
                       // e.printStackTrace();
                    // }
                     //return result;
           //}
           
           
           //testing.add(g);
            //testingOne.add(str);
            //System.out.println(testing.size());
            //System.out.println("------------------------");
            //System.out.println(testingOne.get(0));   
            
                    //System.out.println("this is the list" + listScanner);
        //for(int i = 0;i <= listScanner.size();i++){listScanner.get(i);}
        
        
                          //ArrayList<String> tempArray = new ArrayList<String>();
                  //ArrayList<String> tempArrayTwo = new ArrayList<String>();
                  //PrintWriter writer = new PrintWriter("tempFile.txt", "UTF-8");
                  //Scanner fileScanner = new Scanner(one);
                  //Scanner fileScannerTwo = new Scanner(two);
                  //while (fileScanner.hasNext()){tempArray.add(fileScanner.next());}
                  //while (fileScannerTwo.hasNext()){tempArrayTwo.add(fileScannerTwo.next());}
                  //System.out.println("String example" + string + "," + "temparray example" + tempArrayTwo);
                  //the problem is that the temparray is being added words one at a time (make sure to save the code)
                  //turns out that the scanner prints out words in a list one at a time. perhaps use the 
                  //filestream code in order to get the characters to print out in the manner that they can be used. 
                  //if(tempArray.contains(string)){System.out.println("methodScanner is working");}
                  //if(tempArray.contains(string)){System.out.println("made it");fileOutputStream.secondClassExtends.fileOutputStreamImported.mainMethodFile(two,string);}
                  //else{System.out.println("did not make it");}
                  
                            //catch(UnsupportedEncodingException r){
                  //System.out.println("not working UnsupportedEncodingException");
                  //System.exit(0);
               //}
               
               
               
               

                  
