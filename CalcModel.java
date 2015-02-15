package calccontroller;
import javax.swing.JOptionPane;

/**
 * Demonstration of MVC pattern.
 *
 * CalcModel.java
 *
 * This represents the Model which is a representation of the data
 * and its state. This may also include logic, functions, business
 * rules, etc.
 */

public class CalcModel{
  // add two values
  public double addValues(double op1, double op2){
    return op1 + op2;
  }
    
  // subtract two values
  public double subtractValues(double op1, double op2){
    return op1 - op2;
  }
    
  // multiply two values
  public double multiplyValues(double op1, double op2){
    return op1 * op2;
  }
  
  // divide two values
  public double divideValues(double op1, double op2) {
      double result = 0;
      
      try {
          if(op2 == 0)
              throw new Exception();
          result = op1 / op2;
      }
      catch(Exception e) {
          // System.out.println(e.toString());
          // System.exit(1);
          JOptionPane.showMessageDialog(null, "Dividing by zero is not allowed. Change Op2.");
      }
      
      return result;
  }
    
}
