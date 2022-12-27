import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form1 extends JFrame implements ActionListener
{
    private JLabel L1, L2;
    private JTextField T1, T2;
    private JButton B1, B2;
    
    public  Form1()
    {
        setSize(320,170);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        L1 = new JLabel("Name: ");
        L2 = new JLabel("Surname: ");

        T1 = new JTextField(20);
        T2 = new JTextField(20);

        B1 = new JButton("Submit");
        B2 = new JButton("Reset");

        B1.addActionListener(this);
        B2.addActionListener(this);

        add(L1);
        add(T1);
        add(L2);
        add(T2);
        add(B1);
        add(B2);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Form1 f1 = new Form1();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == B1)
        {
            Form2 f2 = new Form2();
            f2.setName(T1.getText());
            f2.setSurname(T2.getText());
            
        }

        if(e.getSource() == B2)
        {
            T1.setText("");
            T2.setText("");
        }
    }
    
}
