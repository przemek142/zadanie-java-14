import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] firstNames = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<firstNames.length; i++){
            System.out.println("Podaj imię " + (i+1));
            firstNames[i] = scanner.nextLine();
        }

        for (int i=firstNames.length-1; i>=0; i--){
            System.out.println("Cześć " +firstNames[i]);
        }


    }
}
