public class Main {
    public static void main(String[] args) {
        String string = "JavaRush - лучший сервис обучения Java.";

        System.out.println(getPartOfString(string));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.length() < 5) return "";

        return string.substring(string.indexOf("\s") + 1, findSpace(string, 5));
    }

    public static int findSpace(String string, int num) {
        if (num == 1) {
            return string.indexOf(" ");
        } else {
            return string.indexOf(" ", findSpace(string, num - 1) + 1);
        }
    }
}
