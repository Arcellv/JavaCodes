import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CompBox extends JFrame implements ActionListener
{
    private JTextArea T;
    private JComboBox B1, B2;
    
    public CompBox()
    {
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        T = new JTextArea(10,30);
        B1 = new JComboBox();
        B2 = new JComboBox();
        B1.addItem("Choose Back Color:");
        B1.addItem("Green");
        B1.addItem("Yellow");
        add(B1);
        B2.addItem("Choose Text Color:");
        B2.addItem("Red");
        B2.addItem("Blue");
        add(B2);
        add(T);
        B1.addActionListener(this);
        B2.addActionListener(this);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(B1.getSelectedItem() == "Green"){T.setBackground(Color.GREEN);}
        else if(B1.getSelectedItem() == "Yellow"){T.setBackground(Color.YELLOW);}
        else if(B2.getSelectedItem() == "Red"){T.setForeground(Color.RED);}
        else if(B2.getSelectedItem() == "Blue"){T.setForeground(Color.BLUE);}
    }

}
