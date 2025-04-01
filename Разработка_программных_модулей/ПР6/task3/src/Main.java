import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        if (text.toCharArray()[0] == text.toCharArray()[text.length() - 1]){
            System.out.println("да");
        }else{
            System.out.println("нет");
        }

    }
}