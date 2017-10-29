import java.util.Scanner;//字母往前移

public class Main4 {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        String x = src.nextLine();
        int y = src.nextInt();
        for (int i = 0; i < x.length(); i++) {
            int a = (int) x.charAt(i) + y;
            System.out.print((char) a);
        }
        System.out.println();
    }
}