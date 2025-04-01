import java.nio.charset.Charset;

public class Main {
    public static String change(String str){
        StringBuilder result = new StringBuilder();

        for(char i : str.toCharArray()){
            if (Character.isUpperCase(i)){
                result.append(Character.toLowerCase(i));
            }else{
                result.append(Character.toUpperCase(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(change("hello world"));
        System.out.println(change("HELLo wORLD"));
    }
}