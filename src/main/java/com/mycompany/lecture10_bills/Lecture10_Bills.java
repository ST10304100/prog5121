/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture10_bills;
import javax.swing.*;

public class Lecture10_Bills {

    public static void main(String[] args) {
      String strName = JOptionPane.showInputDialog(null, "Enter the customers Name");
      double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Minutes Talked"));
      double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minute"));
      
      bills b = new bills(strName,dblMinutesTalked,dblCostPerMinute);
      
      
      JOptionPane.showMessageDialog(null, "Customer Name:" +
                             b.getName().toUpperCase() +"\n" +
                             "Total Due: R " + b.getTotalBills());
    }
        
    
}
