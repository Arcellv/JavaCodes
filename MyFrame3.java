import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyFrame3 extends JFrame implements ActionListener
{
    private JRadioButton b1, b2, b3, b4;
    private JLabel l1, l2, l3;
    public MyFrame3()
    {
        setSize(240,225);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        l1 = new JLabel();
        l2 = new JLabel("Choose:");
        l3 = new JLabel("Back color?");
        b1 = new JRadioButton("Bird",false);
        b2 = new JRadioButton("Dog",false);

        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        add(l2);
        add(b1);
        add(b2);

        b3 = new JRadioButton("Green",false);
        b4 = new JRadioButton("Yellow",false);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(b3);
        bg1.add(b4);

        add(l3);
        add(b3);
        add(b4);
        add(l1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == b1)
        {
            ImageIcon IM = new ImageIcon(new ImageIcon("parrot.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            l1.setIcon(IM);
        }
        else if(e.getSource() == b2)
        {
            ImageIcon IM = new ImageIcon(new ImageIcon("dog.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            l1.setIcon(IM);
        }
        else if(e.getSource() == b3)
        {
            getContentPane().setBackground(Color.GREEN);
        }
        else if(e.getSource() == b4)
        {
            getContentPane().setBackground(Color.YELLOW);
        }        
    }
}
