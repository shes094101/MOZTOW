import java.util.Scanner;//標準體重計算

public class Main2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int y = src.nextInt();
        if (y==1)
            System.out.println((Math.round(x-80)*0.7f));
        if (y==2)
            System.out.println((Math.round(x-70)*0.6f));
        }
    }

