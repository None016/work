public class Main {
    public static String PrefixSearch(String[] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flowers", "flight", "fly"};
        System.out.println("Longest Common Prefix: " + PrefixSearch(strs1));

        String[] strs2 = {"car", "machine", "taxi"};
        System.out.println("Longest Common Prefix: " + PrefixSearch(strs2));
    }
}