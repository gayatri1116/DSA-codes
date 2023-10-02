import java.util.Scanner;

public class array1 {
    public static void main(String args[]) {
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[0] = marks[0] + 1;

        int percentage = (marks[0] + marks[1] + marks[3]) / 3;

        System.out.println("phy marks =" + marks[0]);
        System.out.println("che marks =" + marks[1]);
        System.out.println("math marks =" + marks[3]);
        System.out.println(marks.length);
        System.out.println("percentage" + percentage + "%");

    }

}
