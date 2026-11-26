import java.text.Format;
import java.util.*;

public class buclesanidados{

    public static void main(String[] args) {
        int num = 0; Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca número un mayor que 1"); int n = scan.nextInt();

        for (int cont1=1;cont1<=n;cont1++) {
            //for (int cont2 = 0; cont2 < n; cont2++) {
                num=cont1; /* + cont2; */ System.out.print(String.format ("%02d ", num));
            //}
            System.out.println();
        }
    }
}