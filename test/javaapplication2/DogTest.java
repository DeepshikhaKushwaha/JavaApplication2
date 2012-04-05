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
public class DogTest {
    
    public DogTest() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {

    }
    
    /**
     * speak takes a message property that cannot be null or empty
     */
    @Test(expected = IllegalArgumentException.class)
    public void speakShouldNotHaveANullMessageParam() {
        Dog dog = new Dog();
        String msg = null;
        dog.speak(msg);
    }
}
