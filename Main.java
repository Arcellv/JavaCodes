/*import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import java.util.Date;

/*public static void main (String [] args)
{
    Grade G1=new Grade();
    Grade G2=new Grade("Jack",45,88,100,56);
    JOptionPane.showMessageDialog(null,"Total Grade of "+G1.name+" is "+G1.TotalGrade());
    JOptionPane.showMessageDialog(null,"Total Grade of "+G2.name+" is "+G2.TotalGrade());
    JOptionPane.showMessageDialog(null,"The Letter Grade of "+G1.name+" is "+G1.Letter_Grade());
}*/
/*public static void main (String [] args) {
    GregorianCalendar Today = new GregorianCalendar();
    int DayOfWeek = Today.get(Calendar.DAY_OF_WEEK);
    int DayOfMonth = Today.get(Calendar.DATE);
    int Month = Today.get(Calendar.MONTH);
    int Year = Today.get(Calendar.YEAR);
    String Day;
    String M;
    switch(DayOfWeek)
    {
        case 1:Day="SUNDAY";break;
        case 2:Day="MONDAY";break;
        case 3:Day="TUESDAY";break;
        case 4:Day="WEDNESDAY";break;
        case 5:Day="TURSEDAY";break;
        case 6:Day="FRIDAY";break;
        case 7:Day="SATUREDAY";break;
    }
    switch(Month)
    {
        case 0:M="JANUARY";break;
        case 1:M="FEBRUARY";break;
        case 2:M="MARCH";break;
        case 3:M="APRIL";break;
        case 4:M="MAY";break;
        case 5:M="JUNE";break;
        case 6:M="JULY";break;
        case 7:M="AUGUST";break;
        case 8:M="SEPTEMBER";break;
        case 9:M="OCTOBER";break;
        case 10:M="NOVEMBER";break;
        case 11:M="DECEMBEr";break;
    }
    JOptionPane.showMessageDialog(null,"Today is "+ DayOfWeek +","+DayOfMonth+"th "+ Month +" "+Year);
}*/

/*public static void main (String [] args)
{
    double a=0,Max=0,Min=0;
    int Answer = JOptionPane.showConfirmDialog(null, "Do You want to Continue? ");
    if (Answer == 0)
    Max = Min = Double.parseDouble(JOptionPane.showInputDialog("So, Enter the first Number: "));
    while(Answer==0)
    {
        Answer = JOptionPane.showConfirmDialog(null, "Do You want to Continue? ");
        if (Answer == 1) break;
        a=Double.parseDouble(JOptionPane.showInputDialog("So, Enter the next Number: "));
        if(a > Max) Max = a;
        else if(a < Min) Min = a;
    }
    JOptionPane.showMessageDialog(null,"Max= "+ Max +"  Min= "+ Min);
}

public static void main (String [] args)
{
    int Answer;
    Answer=JOptionPane.showConfirmDialog(null,"This program displays your age and age group, would you like to continue?");
    if(Answer==0)
    {
        int BY,Age;
        BY=Integer.parseInt(JOptionPane.showInputDialog("Enter Your Birth Year:"));
        GregorianCalendar now = new GregorianCalendar();
        int CurrentYear = now.get(Calendar.YEAR);
        Age=CurrentYear-BY;
        String AgeGroup;
        if(Age>60) AgeGroup="OLD";
        else if(Age>40) AgeGroup="Middle-Age";
        else if(Age>19) AgeGroup="YOUNG";
        else if(Age>12) AgeGroup="Teenager";
        else AgeGroup="CHILD";
        JOptionPane.showMessageDialog(null,"You are "+Age+" Years Old & Your Age Group is "+AgeGroup);
    }
    else
        return;
   }
}*/