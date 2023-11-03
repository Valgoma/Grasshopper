import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT"));
        int n = sc.nextInt();
        int xb = sc.nextInt();
        int yb = sc.nextInt();
        int l = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x + " " + y);
            double d = Math.sqrt((xb-x)*(xb-x) + (yb-y)*(yb-y));
            if (d<=l) {
                String s = String.valueOf(i + 1);
                Files.writeString(Path.of("OUTPUT"), s);
                break;}
            else if(i == n-1)
            {
                Files.writeString(Path.of("OUTPUT"), "YES");
            }
        }

        }
    }
