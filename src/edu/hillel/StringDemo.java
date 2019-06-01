package edu.hillel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        StringDemo stringDemo = new StringDemo();


        String str1 = "Vika";
        String str2 = "Vika Vika";

        System.out.println(str1 == str2); //true

        String str3 = new String("Vika");
        String str4 = new String("ViKA");

        String str5 = str1.concat(str2).concat(str4);


        System.out.println(str1 == str3); //false

        System.out.println(str1.equals(str3)); //true

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));

        System.out.println(str1.compareToIgnoreCase(str4)); //без учета регистра

        System.out.println(str1.concat(str2).concat(str4));

        System.out.println(str5.contains(str1));

        System.out.println(str2.getBytes());

        System.out.println(str1.indexOf(str5));

        System.out.println(str2.indexOf(str1, 0));
        //System.out.println(str2.startsWith(dd));

        System.out.print(str5.toCharArray());

        System.out.println(String.valueOf(111));

        System.out.println(str5.indexOf("Vika"));

        System.out.println(String.format("Hello %s %d", "world", 1));

        System.out.println(String.format("Vika %s %4$d %s %2$d", "Я рождена", 1988, "мне", 31));

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Public\\Documents\\Test_for_Java\\test.txt");
            Scanner scanner = new Scanner(fileInputStream);
            scanner.useDelimiter("[,]");
            while (scanner.hasNext()) {
                System.out.println(String.format("String from file %s", scanner.next()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder;

        stringBuffer.append("str");
        stringBuffer.append("ing");
        stringBuffer.append(" my");
        String newLine = stringBuffer.toString();
        System.out.println(newLine);


    }
}
