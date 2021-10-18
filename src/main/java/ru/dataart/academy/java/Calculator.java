package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int firstNum = listAsInteger(firstNumber);
        int secondNum = listAsInteger(secondNumber);
        return firstNum + secondNum;
    }

    private Integer listAsInteger (List<Integer> number) {
        int res = 0;
        for (int i = 0, sz = number.size(); i < sz; i++) {
            res += number.get(i) * (int)Math.pow(10, i);
        }
        return res;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> res = new ArrayList<>(); //A specific implementation is created (ArrayList). I don't know, it is right or not.
        for (int i = 0, sz = list.size(); i < sz; i+=2 ) {
            res.add(list.get(i));
        }
        return res;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    /*
     * No deep copying of objects occurs in the method
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.isEmpty()) { return Collections.EMPTY_LIST; }
        List<T> res = new ArrayList<>();
        res.add(list.get(0));
        if (list.size() > 1) { res.add(list.get(list.size()-1)); }
        return res;
    }
}
