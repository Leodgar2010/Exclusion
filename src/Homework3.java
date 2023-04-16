import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Homework3 {
         public static String[] enterData() {
            Scanner iScanner = new Scanner(System.in);
            while (true){
                System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
                String data = iScanner.nextLine();
                String[] result = data.split(" ");
                if (result.length == 6) {
                    return result;
                } else if (result.length < 6){
                    System.out.println("Вы ввели не все данные. Попробуйте снова");
                } else System.out.println("Вы ввели слишком много данных Попробуйте снова");
            }
        }
        public static HashMap <String,Object> parsData (String[] arr) {
         HashMap <String,Object> result = new HashMap<>();
            ArrayList <String> name = new ArrayList<>();
            for (String s : arr) {
                if (s.equals("f") || s.equals("m")) {
                    result.put("Пол", s);
                }
                if (s.matches("[0-9]+")) {
                    result.put("Телефонный номер", s);
                }
                if (s.matches(("[0-9]{2}.[0-9]{2}.[0-9]{4}"))) {
                    result.put("Дата рождения", s);
                }
                if (s.matches("[а-яА-я]+") && s.length() > 1) {
                    name.add(s);
                }
                result.put("Ф.И.О.", name);
            }

         if (name.isEmpty() || name.size()>3){
             throw new RuntimeException ("Вы не ввели Ф.И.О. или ввели не полные или избыточные данные.");
         }else if (result.get("Телефонный номер")== null) {
             throw new RuntimeException ("Вы не ввели Телефонный номер или ввели не полные данные.");
         }else if (result.get("Дата рождения") == null) {
             throw new RuntimeException ("Вы не ввели дату рождения или формат даты не подходящий");
        }else if (result.get("Пол") == null) {
             throw new RuntimeException ("Вы не ввели значение пола или формат ввода не подходящий");}
        return result;
}
        public static void CreateOutput (HashMap <String,Object> data) throws IOException {
            ArrayList<String> arr;
            arr = (ArrayList<String>) data.get("Ф.И.О.");
            try {
                FileReader existedfile = new FileReader(arr.get(0) + ".txt");
                existedfile.close();
                FileWriter writer = new FileWriter(arr.get(0) + ".txt", true);
                 for (var item:arr) {
                     writer.write("<" +item + ">");
                 }
                 for (var item : data.entrySet()) {
                     if (!Objects.equals(item.getKey(), "Ф.И.О.")) {
                         writer.write("<" + item.getValue() + ">");
                     }
                 }
                 writer.write ("\n");
                 writer.close();
            } catch (FileNotFoundException e) {

                FileWriter writer = new FileWriter((arr.get(0) + ".txt"));
                for (var item:arr) {
                    writer.write("<" +item + ">");
                }
                for (var item : data.entrySet()) {
                    if (!Objects.equals(item.getKey(), "Ф.И.О.")) {
                        writer.write("<" + item.getValue() + ">");
                    }
                }
                writer.write ("\n");
                writer.close();
                }

            }
        }

