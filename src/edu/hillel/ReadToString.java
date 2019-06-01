package edu.hillel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class ReadToString {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Public\\Documents\\Test_for_Java\\test1.txt");

            Scanner scanner = new Scanner(fileInputStream);
            scanner.useDelimiter("[,]");
            StringBuffer stringBuffer = new StringBuffer();

            while (scanner.hasNext()) {
                stringBuffer.append(scanner.next());
                stringBuffer.append(" ");
            }
            System.out.println(String.format("Result is %s", stringBuffer.toString()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        for (Integer i : list) {
            System.out.println(String.valueOf(i));
        }

        list.stream().forEach(listobj -> {
            System.out.println(list);
        });
        list.stream().
                map(s -> {
                    return String.valueOf(s);
                }).forEach(str ->
        {
            System.out.println(str);
        });

        list.stream().distinct().forEach(a ->
                System.out.println("Unique numbers " + a));


        double sum = list.stream().mapToDouble(a -> a).sum();
        System.out.println("Sum " + sum);


        Map<String, Integer> newMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            newMap.put(String.valueOf(i), i);
        }

        newMap.entrySet().stream().forEach(entrySet ->
                System.out.println(String.format("Map key %s value %d", entrySet.getKey(), entrySet.getValue())));


        Set<Integer> set = list.stream().collect(Collectors.toSet());

        Map myNewMap = set.stream().collect(Collectors.toMap(
                mapKey -> mapKey,
                mapValue -> {
                    return String.valueOf(mapValue);
                }
        ));
        myNewMap.entrySet().stream().forEach(System.out::println);

    }
}
