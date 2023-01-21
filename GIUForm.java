import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GIUForm extends JFrame implements ActionListener{
    JLabel L1 = new JLabel("Enter your name:"    );
    JLabel L2 = new JLabel("Enter your surname:  ");
    JLabel L3 = new JLabel("Enter your age:     ");

    JTextField T1 = new JTextField(25);
    JTextField T2 = new JTextField(25);
    JTextField T3 = new JTextField(25);

    JButton B1 = new JButton("Submit");
    JButton B2 = new JButton("Clear");

    GIUForm(String Title){
        setTitle(Title);
        setSize(500,160);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(L1);
        add(T1);

        add(L2);
        add(T2);

        add(L3);
        add(T3);

        add(B1);
        add(B2);

        B1.addActionListener(this);
        B2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == B1){

            String name,surname;
            int age;
            
            name = T1.getText();
            surname = T2.getText();

            try{
                int yearborn, currentYear = Calendar.getInstance().get(Calendar.YEAR);
                age = Integer.parseInt(T3.getText());
                yearborn = currentYear - age;

                JOptionPane.showMessageDialog(null,"Hello "+ name +" "+ surname +", it seesm that you were born in "+ yearborn);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"You shoould enter a number for the name field","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource() == B2){
            T1.setText("");
            T2.setText("");
            T3.setText("");

            T1.requestFocus();
        }
    }

}
