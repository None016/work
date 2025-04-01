import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> delRepeat(int[] mas){
        ArrayList<Integer> finish = new ArrayList<>();

        int currentValue = mas[0];
        finish.add(mas[0]);

        for(int i : mas){
            if(i != currentValue){
                currentValue = i;
                finish.add(i);
            }
        }
        return finish;
    }


    public static void main(String[] args) {
        int[] testMas = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5};
        System.out.println(delRepeat(testMas));
    }
}