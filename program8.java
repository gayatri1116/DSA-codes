
// check fever or not question in practice set 
import java.util.*;

public class program8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double temp = 103.5;
        if (temp > 100) {
            System.out.println("you have a fever");
        } else {
            System.out.println("you have no fever");
        }
    }

}
