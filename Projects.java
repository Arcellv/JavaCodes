import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Projects {
    
    public static void main(String[] args)
    {
        /*----------------------------FIRST FORM------------------------------------------------*/
        JFrame F1 = new JFrame();
        F1.setTitle("Car Info");
        F1.setSize(420, 520);
        F1.setLayout(new FlowLayout());
        F1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        F1.setLocationRelativeTo(null);

        JLabel l1 = new JLabel("Enter the Car's Information");
        l1.setForeground(Color.BLUE);
        l1.setBounds(100, 10, 200, 10);
        F1.add(l1);

        JLabel l2 = new JLabel("Choose the Brand:");
        l2.setBounds(20, 40, 200, 40);
        F1.add(l2);

        JComboBox<String> c1 = new JComboBox<>();
        c1.setBounds(200, 50, 200, 30);
        F1.add(c1);

        c1.addItem("Choose");
        c1.addItem("Mercedes");
        c1.addItem("BMW");
        c1.addItem("Honda");
        c1.addItem("Mazda");
        c1.addItem("Suzuki");
        c1.addItem("Hyundai");

        JLabel l3 = new JLabel("Choose the Gear Box:");
        l3.setBounds(20, 80, 200, 80);
        F1.add(l3);

        JRadioButton rb1 = new JRadioButton("Manual");
        rb1.setBounds(200, 80, 100, 80);
        F1.add(rb1);

        JRadioButton rb2 = new JRadioButton("Automatic");
        rb2.setBounds(300, 80 , 100, 80);
        F1.add(rb2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel l4 = new JLabel("Enter the Model:");
        l4.setBounds(20, 115, 200, 115);
        F1.add(l4);

        JTextField t1 = new JTextField(10);
        t1.setBounds(200, 160, 200, 30);
        F1.add(t1);

        JLabel l5 = new JLabel("Enter the Year:");
        l5.setBounds(20, 150, 200, 150);
        F1.add(l5);

        JTextField t2 = new JTextField(10);
        t2.setBounds(200, 212, 200, 30);
        F1.add(t2);

        JLabel l6 = new JLabel("Enter the Max Speed:");
        l6.setBounds(20, 185, 200, 185);
        F1.add(l6);

        JTextField t3 = new JTextField(10);
        t3.setBounds(200, 265, 200, 30);
        F1.add(t3);

        JLabel l7 = new JLabel("Enter the Color:");
        l7.setBounds(20, 220, 200, 220);
        F1.add(l7);

        JTextField t4 = new JTextField(10);
        t4.setBounds(200, 318, 200, 30);
        F1.add(t4);

        JButton b1 = new JButton("Add Car to the File");
        b1.setForeground(Color.RED);
        b1.setBounds(30, 371, 370, 30);
        F1.add(b1);

        JButton b2 = new JButton("Open the Search Form");
        b2.setForeground(Color.RED);
        b2.setBounds(30, 424, 370, 30);
        F1.add(b2);

        /*--------------------------------------SECOND FORM--------------------------------------------------------*/

        JFrame F2 = new JFrame();
        F2.setLayout(new FlowLayout());
        F2.setSize(570, 150);
        F2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        F2.setLocationRelativeTo(null);

        JLabel b = new JLabel("Brand");
        b.setBounds(25, 10, 80, 20);
        b.setHorizontalAlignment(JLabel.LEFT);
        b.setVerticalAlignment(JLabel.TOP);
        F2.add(b);

        JTextField tb = new JTextField(20);
        tb.setBounds(14, 30, 70, 20);
        tb.setHorizontalAlignment(JLabel.LEFT);
        F2.add(tb);

        JLabel lg = new JLabel("GearBox");
        lg.setBounds(108, 10,70,20 );
        lg.setHorizontalAlignment(JLabel.LEFT);
        lg.setVerticalAlignment(JLabel.TOP);
        F2.add(lg);

        JTextField tg = new JTextField(20);
        tg.setBounds(105, 30, 70, 20);
        tg.setHorizontalAlignment(JLabel.LEFT);
        F2.add(tg);

        JLabel lm = new JLabel("Model");
        lm.setBounds(201, 10, 55, 20);
        lm.setHorizontalAlignment(JLabel.LEFT);
        lm.setVerticalAlignment(JLabel.TOP);
        F2.add(lm);

        JTextField tm = new JTextField(20);
        tm.setBounds(193, 30,70,20);
        tm.setHorizontalAlignment(JLabel.LEFT);
        F2.add(tm);

        JLabel ly = new JLabel("Year");
        ly.setBounds(294, 10, 55, 20);
        ly.setHorizontalAlignment(JLabel.LEFT);
        ly.setVerticalAlignment(JLabel.TOP);
        F2.add(ly);

        JTextField ty = new JTextField(20);
        ty.setBounds(281, 30,70,20);
        ly.setHorizontalAlignment(JLabel.LEFT);
        F2.add(ty);

        JLabel lmx = new JLabel("MaxSpeed");
        lmx.setBounds(371, 10, 80, 20);
        lmx.setHorizontalAlignment(JLabel.LEFT);
        lmx.setVerticalAlignment(JLabel.TOP);
        F2.add(lmx);

        JTextField tmx = new JTextField(20);
        tmx.setBounds(372, 30,70,20);
        tmx.setHorizontalAlignment(JLabel.LEFT);
        F2.add(tmx);

        JLabel lc = new JLabel("Color");
        lc.setBounds(485, 10,58,20);
        lc.setHorizontalAlignment(JLabel.LEFT);
        lc.setVerticalAlignment(JLabel.TOP);
        F2.add(lc);

        JTextField tc = new JTextField(20);
        tc.setBounds(465, 30, 90, 20);
        tc.setHorizontalAlignment(JLabel.LEFT);
        F2.add(tc);

        JButton b3 = new JButton("Find the fastest car");
        b3.setForeground(Color.RED);
        b3.setBounds(15, 60, 428, 20);
        b3.setHorizontalAlignment(JLabel.CENTER);
        b3.setVerticalAlignment(JLabel.CENTER);
        F2.add(b3);

        JButton b4 = new JButton("Clear");
        b4.setForeground(Color.RED);
        b4.setBounds(464, 60, 90, 20);
        b4.setHorizontalAlignment(JLabel.CENTER);
        b4.setVerticalAlignment(JLabel.CENTER);
        F2.add(b4);


        b1.addActionListener(actionEvent ->
        {

            if(actionEvent.getSource() == b1)
            {
                //Will store the car information...
                String  Brand = "";
                String GearBox = "";
                String Model;
                String Year;
                String MaxSpeed;
                String Color;

                if(c1.getSelectedItem() == "Mercedes"){Brand = c1.getSelectedItem().toString();}
                else if(c1.getSelectedItem() == "BMW"){Brand = c1.getSelectedItem().toString();}
                else if(c1.getSelectedItem() == "Mazda"){Brand = c1.getSelectedItem().toString();}
                else if(c1.getSelectedItem() == "Honda"){Brand = c1.getSelectedItem().toString();}
                else if(c1.getSelectedItem() == "Suzuki"){Brand = c1.getSelectedItem().toString();}
                else if(c1.getSelectedItem() == "Hyundai"){Brand = c1.getSelectedItem().toString();}

                if(rb1.isSelected()){GearBox = rb1.getText();}
                else if(rb2.isSelected()){GearBox = rb2.getText();}

                Model = t1.getText();
                Year = t2.getText();
                MaxSpeed = t3.getText();
                Color = t4.getText();

                // creates File and saves the information on the File
                File myFile = new File("Car_File.txt");
                try (FileWriter myWriter = new FileWriter(myFile, true))
                {
                    myWriter.write(String.format("%-20s%-15s%-15s%-10s%-15s%-15s", Brand, GearBox, Model, Year, MaxSpeed, Color)+"\n");
                    JOptionPane.showMessageDialog(null, "Car information saved successfully !!!");
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, " Error saving car information: " + e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }

                //After clicking the "Add car to File" button the combo-box, radio-buttons and text-boxes will be reset... :)
                // Add up this one to bring a more professional views of my work...
                c1.setSelectedIndex(0);
                bg.clearSelection();
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        // Open the Search File
        b2.addActionListener((ActionEvent actionEvent) ->
        {
            F2.setLayout(null);
            F2.setVisible(true);
            // Add up this one to bring a more professional views of my work...
            F1.setVisible(false);
        });

        // Find the Fastest car
        b3.addActionListener(actionEvent ->
        {
            int MaxSpeed = 0;
            String fastestBrand = "";
            String fastestGearBox = "";
            String fastestModel = "";
            int fastestYear = 0;
            String fastestColor = "";

            File myFile = new File("Car_File.txt");
            try (BufferedReader reader = new BufferedReader(new FileReader(myFile)))
            {
                String line;
                while((line = reader.readLine()) != null)
                {
                    String[] parts = line.split("\\s+");
                    int Speed = Integer.parseInt(parts[4]);
                    if(Speed > MaxSpeed)
                    {
                        MaxSpeed = Speed;
                        fastestBrand = parts[0];
                        fastestGearBox = parts[1];
                        fastestModel = parts[2];
                        fastestYear = Integer.parseInt(parts[3]);
                        fastestColor = parts[5];
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            tb.setText(fastestBrand);
            tg.setText(fastestGearBox);
            tm.setText(fastestModel);
            ty.setText(Integer.toString(fastestYear));
            tmx.setText(Integer.toString(MaxSpeed));
            tc.setText(fastestColor);

        });

        // Clear
        b4.addActionListener(actionEvent ->
        {
            tb.setText("");
            tm.setText("");
            tg.setText("");
            ty.setText("");
            tmx.setText("");
            tc.setText("");
        });

        F1.setLayout(null);
        F1.setVisible(true);

    }
}


