import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class Login extends JFrame implements ActionListener {
   JButton Next , Back ;
   JTextField iname;
    Login() {
        //by using getContainPlane() we can acces all frame
        getContentPane().setBackground(Color.WHITE);
        //Own Layout declear
        setLayout(null);
        //here we want to access image form file directory so used imageIcon class
        //we crete object of this class and to acess image from folder we used classloader class which have static method called getSystemResource()
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./images/login.jpg"));
        // to add any componets in frame we have to used add function. but add directly not access the i1 variable for that save i1 in JLabel.
        JLabel image = new JLabel(i1);
        //make layout(how to place componets in frame) using setBond function
        image.setBounds(0,0,600,500);
        add(image) ;

        // to write anything on frame we used Jlabel class
        JLabel heading = new JLabel("Brain Tease");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        // to add color on font
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);

        // for the Input fild in html we have input type = text in ther we used Jtextfeild class
        // from here we remove JTextField class and define Globly so can all can acces this Input .
        iname = new JTextField();
        iname.setBounds(735,200,300,25);
        iname.setFont(new Font("Timens New Roman ",Font.BOLD,20) ); 
        add(iname);

        // create button which Globaly initilized
        Next = new JButton("Next");
        Next.setBounds(735,270,120,25);
        Next.setBackground(new Color(30,144,254));
        Next.setForeground(Color.WHITE);
        //like onclick function if action performe in button call this function
        Next.addActionListener(this);
        add(Next);

        Back = new JButton("Back");
        Back.setBounds(915,270,120,25);
        Back.setBackground(new Color(30,144,254));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);


        setLocation(200, 150);
        setSize(1200, 500);
        setVisible(true);
    }
// override actionListener Method 
    public void actionPerformed(ActionEvent ae){
     //here we have to used Next and Back so make this Next button globaly initilized
        if(ae.getSource() == Next){
            //store the input data in name varial by using getText() function
            String name = iname.getText(); // iname is variable which take the user input in login page . 
            // if we press next button then first diseable login frame new frame should be open
            setVisible(false);
            //define rule object which initilized in rule object
            new Rules(name); // we pased the name which store the input in rules object 

     }
     else if(ae.getSource() == Back){
     // if back button is press then our frame should not be dissble means closed
        setVisible(false); 
     }
    }

    public static void main(String[] args) {
        //here we create login object i.e Login login = new Login();
        //anonymous object 
        new Login();
    }
}
