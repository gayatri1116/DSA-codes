//call by value example
//(actually its not part of an array) 
public class array3 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }

    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        swap(a, b);
        System.out.println("a= " + a + "b = " + b);
    }

}
