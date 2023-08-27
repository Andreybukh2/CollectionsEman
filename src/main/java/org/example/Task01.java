package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //создаем список
        List<Integer> integerList = new ArrayList<>();

        // добавляем в список элементы с клавиатуры, с конца
        for (int i=0; i<3; i++)
        {
            Integer integer = Integer.valueOf(reader.readLine());
            integerList.add(0, integer);
        }

        // Используя цикл выводим содержимое на экран

        for (int i=0; i < integerList.size(); i++)
        {
            System.out.println(integerList.get(i));
        }
    }
}
