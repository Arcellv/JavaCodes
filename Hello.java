import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello extends JFrame implements ActionListener 
{
    private JMenuBar Bar;
    private JMenu menu,submenu, menu2;
    private JMenuItem txtItem, imgItem, menuItem, exitItem, menuItem2;
    Form3 f;

    public Hello(String Title)
    {
        setTitle(Title);
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Bar = new JMenuBar();
        menu = new JMenu("Menu options");
        submenu = new JMenu("Submenu options");

        menu2 = new JMenu("Menu2 options");
        menuItem2 = new JMenuItem("Show the second Frame");

        menu2.add(menuItem2);

        txtItem = new JMenuItem("text menu");
        menu.add(txtItem);
        menu.addSeparator();

        imgItem  = new JMenuItem("text with an icon");
        ImageIcon icon = new ImageIcon( new ImageIcon("dog.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        imgItem.setIcon(icon);
        
        submenu = new JMenu("Sub MenuItem");
        menuItem = new JMenuItem("Sub MenuOption");
        exitItem = new JMenuItem("EXIT");

        submenu.add(menuItem);
        menu.add(imgItem);
        menu.addSeparator();
        menu.add(submenu);
        menu.addSeparator();
        menu.add(exitItem);

        Bar.add(menu);
        Bar.add(menu2);

        add(Bar);

        txtItem.addActionListener(this);
        imgItem.addActionListener(this);
        menuItem.addActionListener(this);
        exitItem.addActionListener(this);
        menu2.addActionListener(this);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        new Hello("Menu-Bars");
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == txtItem){JOptionPane.showMessageDialog(null, "Text option was clicked ");}
        else if (e.getSource() == imgItem){JOptionPane.showMessageDialog(null, "Image option was clicked ");}
        else if (e.getSource() == menuItem){JOptionPane.showMessageDialog(null, "Menu option was clicked ");}
        else if (e.getSource() == menuItem2){ f = new Form3();}
        else if (e.getSource() == exitItem){dispose();}
    }
}
