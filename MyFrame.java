import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener
{
    private JTextField t1;
    private JRadioButton r1,r2;

    public MyFrame(String Title) 
    {
        setTitle(Title);
        setSize(400,100);
        setLayout(new FlowLayout());

        t1 = new JTextField(30);
        r1 = new JRadioButton("Click here for RED");
        r2 = new JRadioButton("Click here for GREEN");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(r1);
        add(r2);
        r1.addActionListener(this);
        r2.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==r1){t1.setText("You havechosen RED!!!");}
        else if (e.getSource()==r2){t1.setText("You havechosen GREEN!!!");}
    }
   
}
