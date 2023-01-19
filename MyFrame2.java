import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener
{
    private JCheckBox cr,cb,cg;

    public MyFrame2(String Title)
    {
        setTitle(Title);
        setSize(400,300);
        setLayout(new FlowLayout());

        cr = new JCheckBox("RED");
        cb = new JCheckBox("BLUE");
        cg = new JCheckBox("GREEN");

        ButtonGroup bg = new ButtonGroup();
        bg.add(cr);
        bg.add(cb);
        bg.add(cg);

        cr.addActionListener(this);
        cb.addActionListener(this);
        cg.addActionListener(this);

        add(cr);
        add(cb);
        add(cg);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (cr.isSelected()){getContentPane().setBackground(Color.RED);}
        else if (cb.isSelected()){getContentPane().setBackground(Color.BLUE);}
        else if (cg.isSelected()){getContentPane().setBackground(Color.GREEN);}
    }
    
    public static void main(String[] args)
    {
        new MyFrame2(null);
    }
}
