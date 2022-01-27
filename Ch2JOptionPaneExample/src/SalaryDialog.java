import javax.swing.*;

//import javax.swing.*;
public class SalaryDialog
{
   public static void main(String[] args)
   {
       String wageString, dependentsString;
       double wage, weeklyPay;
       int dependents;
       final double HOURS_IN_WEEK = 37.5;
       wageString = JOptionPane.showInputDialog(null,
          "Enter employee's hourly wage", "Hourly Wage Entry",
          JOptionPane.INFORMATION_MESSAGE);
       try{
           weeklyPay = Double.parseDouble(wageString) *
                   HOURS_IN_WEEK;
       }
      catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null, "Hours must be numeric, defaulted to 0");
        weeklyPay = 0;
       }
       dependentsString = JOptionPane.showInputDialog(null,
          "How many dependents?", "Dependents Entry",
          JOptionPane.QUESTION_MESSAGE);
       dependents = Integer.parseInt(dependentsString);
       JOptionPane.showMessageDialog(null, "Weekly salary is $" +
          weeklyPay + "\nDeductions will be made for " +
          dependents + " dependents");
       JOptionPane.showMessageDialog(null, "Program is ending");
    }
}