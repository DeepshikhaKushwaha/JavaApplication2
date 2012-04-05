/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Instlogin
 */
public class Person {
    private String lastName;
    private double vacationDays;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }

    public double getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(double vacationDays) {
        if(vacationDays < 0 || vacationDays > 20) {
            throw new IllegalArgumentException();
        }
        this.vacationDays = vacationDays;
    }
    
    public int getAgeInDays(int ageInYears) {
        return ageInYears * 365;
    }
    
 
  
    
}
