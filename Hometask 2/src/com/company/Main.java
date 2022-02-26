package com.company;

import java.lang.Math;

import static java.lang.Math.sqrt;


public class Main {

    public static void main(String[] args) {
        //Задание 1.1.5
        int first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, resultSum, result;
        double resultDouble;
        first = 1;
        second = 2;
        third = 3;
        fourth = 4;
        fifth = 5;
        sixth= 6;
        seventh = 7;
        eighth = 8;
        ninth = 9;
        tenth = 10;

        resultSum = first + second + third + fourth + fifth + sixth + seventh + eighth + ninth + tenth;
        result = resultSum / 10;

        resultDouble = (double)resultSum / 10;

        System.out.println(result);
        System.out.println(resultDouble);
        // Задание 1.1.6

        var x = 0.25;
        var y = 0.9;
        var resultOne = 10*x + y;
        var resultTwo = y*sqrt(x);

        var resultThree = Math.pow(x, y) - 1;
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        //Тема 4,  1.1.7
        double xNew = 10;
        xNew = Math.sqrt(xNew);
        System.out.println(xNew);
        //Про треугольник, переменные названы по другому.
        var a = 5;
        var b = 10;
        double c = Math.sqrt(a * a + b * b);
        System.out.println(c);

        // Задание 1.1.7 - с (Тема 4)
        var d = 10;
        var e = 20;
        var z = Math.sqrt(e-d);
        z += 1;
        System.out.println(z);

        var f = -30;
        var g = 40;
        var value = Math.abs(f -g);
        System.out.println(value);

        // Тема 6
        //Задача 1.1.8
        var itemOne = 1000;
        var itemTwo = 500;
        var sum = (itemOne +itemTwo) * 0.9;
        var discount = (itemOne + itemTwo) * 0.1;
        System.out.println(sum);
        System.out.println(discount);
        //Задача 1.1.10

        double firstValue = 200;
        double realValue = 200*0.85;
        double secondValue = 30;
        double taskResult = 10* realValue + 2* secondValue;
        System.out.println(taskResult);

        firstValue = 500;
        realValue = firstValue * 0.5;
        secondValue = 50;
        taskResult = 7* realValue + secondValue;
        System.out.println(taskResult);

        firstValue = 300;
        realValue = firstValue * 0.9;
        secondValue = 20;
        taskResult = 2* realValue + 3*secondValue;
        System.out.println(taskResult);

    }
}
