import java.util.Scanner;
import javax.swing.JOptionPane;

public class Point {
    private double x;
    private double y;
    static int count = 0;
    public Point(){x=y=0;count++;}
    public Point(double a, double b){x=a;y=b;count++;}
    public Point(int a){
        System.out.print("Enter the coordinates:");
        try (Scanner s = new Scanner(System.in)) {
            x = s.nextDouble();
            y = s.nextDouble();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter numbers","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        count++;
    }

    public void Display(){System.out.println("X = " + x +" Y = " + y);}
    public void Change(double a, double b){x=a; y=b;}
    public double distance_from_origin(){
        return Math.sqrt(Math.pow((x-0),2) + Math.pow((y-0),2));
    }
    public double Distance(Point a){
        return Math.sqrt(Math.pow((x=a.x),2) + Math.pow((y-a.y),2));
    } 
    public void Location(){
        if (x == 0 && y == 0) System.out.println("On the Origin");
        else if (x > 0 && y == 0) System.out.println("On the X + axis");
        else if (x < 0 && y == 0) System.out.println("On the X - axis");
        else if (x == 0 && y > 0) System.out.println("On the Y + axis");
        else if (x == 0 && y < 0) System.out.println("On the Y - axis");
        else if (x > 0 && y > 0) System.out.println("On the Quadrant I");
        else if (x < 0 && y > 0) System.out.println("On the Quadrant II");
        else if (x < 0 && y < 0) System.out.println("On the Quadrant III");
        else System.out.println("On the Quadrant IV");
    }
    public void Number_of_objects(){
        System.out.println("The number of point until now is: " + count);
    }
}

/*public static void main(String[] args){             
Point p1 = new Point();
p1.Display();

Point p2 = new Point(5,10);
p2.Display();

Point p3 = new Point(10);
p3.Display();
p1.Change(2, 4);

System.out.println("Distance from origin is: " + p1.distance_from_origin());
System.out.println("Distance is: " + p1.Distance(p2));
p3.Location();
p1.Number_of_objects();
p2.Number_of_objects();
}*/
