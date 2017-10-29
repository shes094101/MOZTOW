import java.util.Scanner;//字串數字總和

public class Main5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String x = src.nextLine();
        int o = 0;
        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);
            o = o + Character.getNumericValue(y);
        }
            System.out.println(o);
    }
}
