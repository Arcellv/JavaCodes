import javax.swing.JOptionPane;

public class Grade {
    private double MT, Final, Quiz, Lab;
    public String name;
    public Grade(){
        name = JOptionPane.showInputDialog("Who are you ?");

        do{
            MT = Double.parseDouble(JOptionPane.showInputDialog("Enter your midterm exam grade:"));
        }
        while(MT < 0 || MT > 100);

        while(true){
            Quiz = Double.parseDouble(JOptionPane.showInputDialog("Enter your Quiz grade:"));
            if(Quiz >= 0 && Quiz <= 100){break;}
            else{JOptionPane.showMessageDialog(null,"Please enter a valid grade!!!");}
        }
        Lab = Double.parseDouble(JOptionPane.showInputDialog("Enter your LAB grade:"));
        Final = Double.parseDouble(JOptionPane.showInputDialog("Enter your Final exam grade:"));
    }

public Grade(String N,double M, double Q, double L, double F) {
    name = N;
    MT = M;
    Quiz = Q;
    Lab = L;
    Final = F;
}

public double TotalGrade(){
    return MT * 0.35 + Quiz * 0.10 + Lab * 0.10 + Final * 0.45;  
} 
public char Letter_Grade(){
    double TG = TotalGrade();
    if (TG  >= 90) {return 'A';}
    else if (TG >= 70){return 'B';}
    else if (TG >= 70){return 'C';}
    else {return 'F';}
}

}
