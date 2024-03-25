import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер задания: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        switch (num) {
            default:  {
                System.out.println("такого задания нет");
                break;
            }
            case 1:  {
                System.out.println("Введите строку: ");
                String str = in.next();
                String str2 = str.toLowerCase();
                System.out.println("новая строка:\n" + str2);
                break;
            }
            case 2:  {
                System.out.println("Введите строку: ");
                String str = in.next();
                if (str.length() % 2 == 0) {
                    int n = str.length() / 2;
                    System.out.println("новая строка:\n" + str.charAt(n-1) + str.charAt(n));
                } else {
                    System.out.println("строка должна иметь чётное количество символов");
                }
                break;
            }
            case 3: {
                Employee[] employees = new Employee[3];
                employees[0] = new Employee("Абдусаломов Нуриддин", 50000.00);
                employees[1] = new Employee("Шишацкая Ксения", 60000.00);
                employees[2] = new Employee("Ефимик Анна", 70000.00);
                Report.generateReport(employees);
                break;
            }
            case 4: {
                String str = "Versions: Java 5, Java 6, Java  7, Java 8, Java 12.";
                Pattern pattern = Pattern.compile("(Java \\d+)");
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    System.out.println(matcher.group().replace(",", ""));
                }
                break;
            }
            case 5:{
                String str = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
                String[] words = str.split(" ");
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    boolean isNumeric = true;
                    for (int j = 0; j < word.length(); j++) {
                        if (!Character.isDigit(word.charAt(j))) {
                            isNumeric = false;
                            break;
                        }
                    }
                    if (isNumeric) {
                        int start = 0;
                        int end = word.length() - 1;
                        boolean isPalindrome = true;
                        while (start < end) {
                            if (word.charAt(start) != word.charAt(end)) {
                                isPalindrome = false;
                                break;
                            }
                            start++;
                            end--;
                        }
                        if (isPalindrome) {
                            System.out.println(word.replace(",", ""));
                        }
                    }
                }
                break;
            }
        }
    }
}