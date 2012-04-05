/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Instlogin
 */
public class PersonTest {
    private Person person;
    
    public PersonTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        person = new Person();
    }
    
    @After
    public void tearDown() {
        person = null;
    }
    
    @Test
    public void ageInDaysShouldBeMultipleOf365() {
        int ageInYears = 10;
        int expected = ageInYears * 365;
        int actual = person.getAgeInDays(ageInYears);
        assertEquals(expected, actual);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void vacationDaysShouldNotBeGreaterThan20() {
        person.setVacationDays(21);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void vacationDaysShouldNotBeLessThan0() {
        person.setVacationDays(-1);
    }
    
    @Test
    public void vacationDaysShouldBe0to20() {
        double[] legalValues = {
            0.0, 0.5, 1.0, 10.0, 15.0, 20.0, 10.5
        };
        
        try {
            for(double d : legalValues) {
                person.setVacationDays(d);
            }
        } catch(Exception e) {
            fail("Legal value was rejected, not good!");
        }
    }
    
    
    
    /**
     * Last name can never be null and if it is
     * a IllegalArgumentException should be thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void lastNameShouldNotBeNull() {
        person.setLastName(null);
    }

    /**
     * Last name can never be empty and if it is
     * a IllegalArgumentException should be thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void lastNameShouldNotBeEmpty() {
        person.setLastName("");
    }
    
    
    /**
     * Last name can never be null or empty.
     */
    @Test
    public void lastNameShouldHaveContent() {
        String[] legalValues = {
            "a", " ", "xxx", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            "abcdefg34", "45467889"
        };
        
        for(String lv : legalValues) {
            person.setLastName(lv);
        }
    }

}
