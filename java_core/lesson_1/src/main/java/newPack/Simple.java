package newPack;

import java.time.LocalDateTime;

/**
 * @version 1.0
 */
public class Simple {
    /**
     *
     * @param args some arguments incoming to main method
     */
    public static void main(String[] args) {
        System.out.println(test());
    }

    /**
     *
     * @return Note to string test method
     */
    public static String test(){
        return new Complex("Note 1",LocalDateTime.now()).toString();
    }
}