import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import java.awt.event.*;

public class MyForm extends JFrame implements ActionListener 
{
    
    JButton cars, vans, reset;
    JTextField T1, T2;
    JPanel P1, P2;

    public MyForm(String Title)
    {
        setTitle(Title);
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        P1 = new JPanel();
        P1.setBorder(BorderFactory.createLineBorder(Color.RED));
        P1.setBackground(Color.PINK);
        P1.add(new JLabel("     Cars"));
        T1 = new JTextField(10);
        T1.setFont(new Font("verdana", Font.BOLD,28));
        T1.setEditable(false);
        T1.setPreferredSize(new DimensionUIResource(100,50));
        P1.add(T2);
        add(P1,"North");

        P2 = new JPanel();
        P2.setBackground(Color.YELLOW);

        cars = new JButton("Vans");
        vans.addActionListener(this);
        P2.add(reset);
        reset = new JButton("reset");
        reset.addActionListener(this);
        add(P2,"South");
        add(new JLabel("East"),"East");
        add(new JLabel("West"),"West");
        add(new JLabel("Center"),"Center");

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int i = 0;
        if(e.getSource() == cars)
        {
            i = Integer.parseInt(T1.getText()) +1;
            T1.setText(Integer.toString(i));
        }
        else if(e.getSource() == vans)
        {
            i = Integer.parseInt(T2.getText()) +1;
            T2.setText(Integer.toString(i));
        }
        else if(e.getSource() == reset)
        {
            T1.setText("0");
            T2.setText("0");
        }
    }
}
