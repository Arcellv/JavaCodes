import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;


public class GUI2Form extends JFrame implements ActionListener
{

    private JLabel L1,L2,L3;
    private JTextField T1,T2;
    private JRadioButton RB1,RB2;
    private JComboBox C1;
    private JButton B1,B2;

    private double Fees,Type,Course;
    private String CourseStr;


    public GUI2Form()
    {
        
        setSize(450,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        L1 = new JLabel("Enter your name: ");
        L2 = new JLabel("Select the number of course you want to take: ");
        L3 = new JLabel("Total fees you need to pay: ");

        T1 = new JTextField(20);
        T2 = new JTextField(10);

        RB1 = new JRadioButton("Home student");
        RB2 = new JRadioButton("Overseas Student");

        ButtonGroup bg = new ButtonGroup();
        bg.add(RB1);
        bg.add(RB2);

        C1 = new JComboBox();
        C1.addItem("-- Select --");
        for (int i = 4; i < 8; i++){C1.addItem(i);}

        B1 = new JButton("Submit");
        B2 = new JButton("Clear");

        /* C1.addItem("-- Select --");
        C1.addItem("4");
        C1.addItem("5");
        C1.addItem("6");
        C1.addItem("7");*/

        add(L1);
        add(T1);
        add(RB1);
        add(RB2);
        add(L2);
        add(C1);
        add(B1);
        add(L3);
        add(T2);
        add(B2);

        C1.addActionListener(this);
        RB1.addActionListener(this);
        RB2.addActionListener(this);
        B1.addActionListener(this);
        B2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
         if (e.getSource() == B1)
         {
            if (RB1.isSelected())
            {
                Type = 600.0;
                CourseStr = C1.getSelectedItem().toString();
                Course = Double.parseDouble(CourseStr);
                Fees = Type * Course;
                T2.setText(Double.toString(Fees)+" tl");
            }

            else if(RB2.isSelected())
            {
                Type = 1000.0;
                CourseStr = C1.getSelectedItem().toString();
                Course = Double.parseDouble(CourseStr);
                Fees = Type * Course;
                T2.setText(Double.toString(Fees)+" tl");
            }
         }

         if (e.getSource() == B2)
         {
            if (RB1.isSelected())
            {
                RB1.setSelected(false);
            }
            else if (RB2.isSelected())
            {
                RB2.setSelected(false);
            }
            T1.setText("");
            T2.setText("");
            C1.setSelectedIndex(0);
         }
    }
}
