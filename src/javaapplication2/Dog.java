package javaapplication2;

/**
 *
 * @author Instlogin
 */
public class Dog {
    private String msg;
    
    public void speak(String msg) {
        if(msg == null) {
            throw new IllegalArgumentException();
        }
        this.msg = msg;
    }
}
