package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) throws Exception
    {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }
    public static int getMinimum(List<Integer> getMinimumList) {
        int min = getMinimumList.get(0);
        for (Integer integer : getMinimumList)
        {
            if (min > integer)
                min = integer;
        }
        return min;
    }
    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> bufferList = new ArrayList<>();
        for (int i = 0; i < 3; i++)
        {
            bufferList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return bufferList;
    }
}
