/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jsv_ppa;    //Payroll Processing Application
import java.sql.SQLException;

/**
 *
 * @author Jilbert PC
 */
public class JSV_PPA {
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        WelcomeForm wcform = new WelcomeForm();
        wcform.setVisible(true);
    }
    
}
