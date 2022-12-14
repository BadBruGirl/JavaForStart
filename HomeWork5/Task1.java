package HomeWork5;
// 1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько телефонных номеров вы хотите добавить в справочник? ");
        int count = input.nextInt();
        for (int i = 0; i < count; i++)
            System.out.println(addTelNumber(hm));
        System.out.println("Для поиска номера телефона введите фамилию владельца: ");
        String surname = input.next();
        System.out.println("Введите имя владельца: ");
        String name = input.next();
        getTelNumber(hm, surname + " " + name);
        input.close();

    }

    private static Map<String, String> addTelNumber(Map<String, String> hm) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String telNum = in.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = in.nextLine();
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        hm.put(telNum, surname + " " + name);
        return hm;
    }

    private static void getTelNumber(Map<String, String> hm, String person) {
        for (var item : hm.entrySet()) {
            if (item.getValue().equals(person))
                System.out.println(item.getKey());
            if (!(hm.containsValue(person)))
                System.out.println("Такого владельца в справочнике нет");
        }
    }
}
