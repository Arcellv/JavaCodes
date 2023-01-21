import javax.swing.*;

public class Dog extends Pet 
{
    private String name;

    public Dog(String n, String b, int a) {
        super(b, a);
        name = n;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void adoptionCompleted() {
        JOptionPane.showMessageDialog(null, name + "is adopted by " + getOwnerName());
    }

    public void move(String from, String to) {
        JOptionPane.showMessageDialog(null, name + " moves from " + from + " to " + to);
    }

    public void eat(String food) {
        JOptionPane.showMessageDialog(null, name + " eats " + food);
    }

    public void sleep(int hours) {
        JOptionPane.showMessageDialog(null, name + " sleeps for " + hours + " hours");
    }
}