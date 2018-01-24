import java.util.Scanner;

public class Backward {

    public static void main(String[] args) {

        String[] names = new String[5];

        System.out.println("Type five names: ");

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("");

        for(int i = names.length -1; i >= 0; i--) {
            System.out.println("Czesc " + names[i]);
        }

        sc.close();
    }
}