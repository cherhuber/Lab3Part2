/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calccontroller;


import java.awt.event.*;

public class CalcController {

    // There is a reference to both the view and the model
    private static CalcView view;
    private static CalcModel model;

    public CalcController() {
        /**
         * Create and set the listeners to the view
         */
        view = new CalcView();
        model = new CalcModel();
        // Addition
        view.setAddListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                view.setResult(model.addValues(
                        view.getOperand1(),
                        view.getOperand2()));
            }
        });

        // Subtraction
        view.setSubtractListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                view.setResult(model.subtractValues(
                        view.getOperand1(),
                        view.getOperand2()));
            }
        });
        
        // Multiply
        view.setMultiplyListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                view.setResult(model.multiplyValues(
                        view.getOperand1(), 
                        view.getOperand2()));
            }
        });
        
        // divide
        view.setDivideListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                view.setResult(model.divideValues(
                        view.getOperand1(), 
                        view.getOperand2()));
            }
        });

    }
    
    public static void main(String[] args){
        CalcController controller = new CalcController();
    }
}
