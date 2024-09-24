import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
  String name ; // globly store the value of name which passed from the login frame 
  JButton Back , Start;
  Rules(String name){ // constructor take parameter i.e name 
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

     JLabel heading = new JLabel("Welcome " + name + " to Brain Tease " );
     heading.setBounds(50,20,700,45);
     heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
     heading.setForeground(new Color(30,144,254));
     add(heading);

     JLabel rules = new JLabel();
     rules.setBounds(20,90,700,400);
     rules.setFont(new Font("Tahoma",Font.PLAIN,16));
     // here by setText() method we can set  our text or write dynamically our text
     rules.setText(
      "<html>" +
     
         "1. Time Limit: Each quiz will have a specified time limit. Once the time is up, the quiz will automatically submit." + "<br> <br>" +
         "2. No Backtracking: You cannot go back to previous questions once you have moved forward. Make sure to answer carefully." + "<br> <br>" +
         "3. Auto-Save: Your answers will be auto-saved as you progress through the quiz. In case of any disruptions, you can resume where you left off." + "<br> <br>" +
         "4. No External Help: You must complete the quiz on your own. Any use of external resources or assistance is prohibited." + "<br> <br>" +
         "5. No Cheating: Any attempt to cheat, including opening new tabs or using unauthorized devices, will result in disqualification." + "<br> <br>" +
         "6. Results: Your score will be displayed immediately after the quiz. The results will be final and cannot be contested." + "<br> <br>" +
         "7. Privacy: Your quiz data is confidential and will not be shared with others." + "<br> <br>" +
      
      "</html>"
     
     );

     add(rules);

     Back = new JButton("Back");
     Back.setBounds(250,500,100,30);
     Back.setBackground(new Color(30,144,254));
     Back.setForeground(Color.WHITE);
     Back.addActionListener(this);
     add(Back);

     Start = new JButton("Start");
     Start.setBounds(400,500,100,30);
     Start.setBackground(new Color(30,144,254));
     Start.setForeground(Color.WHITE);
     Start.addActionListener(this);
     add(Start);
    setSize(800,650);
    setLocation(350,100);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == Start){
      setVisible(false);  
      new Quiz(name);
    }
    else {
       setVisible(false);
       new Login() ;// we create the object of login frame and redirect onit as back button is press 

    }
  }
    public static void main (String args []){
        new Rules("user"); //if user not inter anything in input feild so rules frame open with default name user 

    }
}

