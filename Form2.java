import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Form2 extends JFrame implements ActionListener
{
    private JLabel L1, L2;
    private JButton B1;

    public Form2()
    {
        setSize(240,170);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new FlowLayout());

        L1 = new JLabel("Name: ");
        L2 = new JLabel("Surname: ");

        B1 = new JButton("Return to the main Form");

        B1.addActionListener(this);
        add(L1);
        add(L2);
        add(B1);
        setVisible(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent windowEvent)
            {
                if(JOptionPane.showConfirmDialog(null,"Do you want to close this window ?","Reallly closing ?", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    dispose();
                }
            }
        });
        
    }

    public void setName(String name){L1.setText("name: "+name);}
    public void setSurname(String surname){L2.setText("surname: "+surname);}
    
    public void actionPerformed(ActionEvent e)
    {
        dispose();
    }
}
