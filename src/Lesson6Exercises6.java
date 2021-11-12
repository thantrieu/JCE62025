/**
 * @author  Branium Academy
 * @version 2021.11
 * @see     https://braniumacademy.net
 */
import java.util.Scanner;

public class Lesson6Exercises6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi họ và tên: ");
        String fullName = scanner.nextLine();
        String result = fullName.trim();
        result = result.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
