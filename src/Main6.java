import java.util.Scanner;//找零錢

public class Main6 {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int a1 = src.nextInt();
        int a2 = src.nextInt();
        int a3 = src.nextInt();
        int toutle = n - (a1 * 15 + a2 * 20 + a3 * 30);
        if (toutle < 0) {
            System.out.println("0");
        } else {
            System.out.println(toutle % 50 % 5);
            System.out.println(toutle % 50 / 5);
            System.out.println(toutle / 50);
        }
    }
}
