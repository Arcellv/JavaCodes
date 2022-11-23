import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2
{
    public static void main(String[] args)
    {
        JFrame F1=new JFrame("MyForm");
        F1.setLayout(new FlowLayout());
        F1.setSize(360,200);
        //F1.setBounds(20,20,500,400);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F1.setLocationRelativeTo(null);

        JLabel L1=new JLabel("Enter the First Number:");
        L1.setBounds(20,20,150,10);
        F1.add(L1);

        JTextField T1=new JTextField(10);
        T1.setBounds(175,17,150,20);
        F1.add(T1);

        JLabel L2=new JLabel("Enter the Second Number:");
        L2.setBounds(20,50,150,10);
        F1.add(L2);

        JTextField T2=new JTextField(10);
        T2.setBounds(175,47,150,20);
        F1.add(T2);

        JButton B1=new JButton("+");
        B1.setBounds(20,80,50,30);
        B1.setBackground(Color.YELLOW);
        B1.setForeground(Color.RED);
        F1.add(B1);

        JButton B2 =new JButton("pow");
        B2.setBounds(80,80,65,30);
        B2.setBackground(Color.BLUE);
        B2.setForeground(Color.YELLOW);
        F1.add(B2);

        JButton B3 =new JButton("Square root");
        B3.setBounds(155,80,120,30);
        B3.setBackground(Color.white);
        B3.setForeground(Color.green);
        F1.add(B3);

        JButton B4 =new JButton("C");
        B4.setBounds(280,80,45,30);
        B4.setBackground(Color.white);
        B4.setForeground(Color.green);
        F1.add(B4);

        JLabel L3=new JLabel("The Result will Appear Here!");
        L3.setBounds(20,125,200,20);
        F1.add(L3);

        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double a = Double.parseDouble(T1.getText());
                    double b = Double.parseDouble(T2.getText());
                    double r = a + b;
                    L3.setText(a + " + " + b + " = " + r);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Enter a Valid number","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        B3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double a = Double.parseDouble(T1.getText());
                    double r = Math.sqrt(a);
                    L3.setText("Square root of " +a+" = " + r);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Enter a Valid number","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        B4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
              T1.setText("");
              T2.setText("");
              L3.setText("the result will appear here");
            }
        });

        F1.setLayout(null);
        F1.setVisible(true);
    }
}