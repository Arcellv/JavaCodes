import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form22 extends JFrame implements ActionListener
{
    private JButton B1, B2;

    public Form22()
    {
        setSize(200,100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        B1 = new JButton("Open new Form1");
        B2 = new JButton("Close this Form");

        add(B1);
        add(B2);

        B1.addActionListener(this);
        B2.addActionListener(this);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == B1){Form11 f1 = new Form11();}
        else if(e.getSource() == B2){dispose();}
    }
}
