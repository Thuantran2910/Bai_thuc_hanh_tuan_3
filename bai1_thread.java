import javax.swing.*;
import java.text.*;
import java.util.*;

public class bai1_thread implements Runnable{
    JFrame f;
    Thread t= null;
    String timeString = "";
    JButton b;

    bai1_thread(){
        f = new JFrame();

        t= new Thread(this);
        t.start();

        b = new JButton();
        b.setBounds(100,100,100,50);

        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void run(){
        try{
            while(true){
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                timeString = formatter.format(new Date());
                printTime();
                t.sleep(1000);
            }
        }catch(Exception e){

        }
    }
    public void printTime(){
        b.setText(timeString);
    }
    public static void main(String[] args){
        new bai1_thread();
    }

}

   