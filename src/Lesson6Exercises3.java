/**
 * @author  Branium Academy
 * @version 2021.11
 * @see     https://braniumacademy.net
 */
import java.util.Scanner;

public class Lesson6Exercises3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào: ");
        String str = scanner.nextLine();
        String result = str.replace(" ", "*");
        System.out.println(result);
    }
}
