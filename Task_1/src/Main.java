import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n=0;
        Scanner scan  = new Scanner(System.in);

        try {
            n = scan.nextInt();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Bad dimension");
        }


        Matrix matrix = new Matrix(n);
        matrix.create();
        matrix.print();
    }
}
