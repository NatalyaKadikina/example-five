package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1. Объявите три массива:
        // Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        System.out.println("Задание 1.1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        System.out.println("Задание 1.2");
        double[] arr = {1.57, 7.654, 9.986};
        for (int d = 0; d < arr.length; d++) {
            System.out.println(arr[d]);
        }

        //Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
        // массива: с помощью ключевого слова или сразу заполненный элементами.
        System.out.println("Задание 1.3");
        int[] app = {5, 7, 8};
        for (int a = 0; a < app.length; a++) {
            System.out.println(app[a]);
        }

        //Задание 2
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого
        //элемента, через запятую. Запятая между последним элементом одного массива и первым элементом следующего
        //не нужна.
        //Задание 2.1
        System.out.println("Задание 2.1");
        int[] weight2 = new int[3];
        weight2[0] = 1;
        weight2[1] = 2;
        weight2[2] = 3;
        for (int i = 0; i < weight2.length; i++)
        if(i != weight2.length -1) {
            System.out.print(weight2[i] + ", ");
        } else {
            System.out.print(weight2[i]);
        }

        //Задание 2.2
        System.out.println();
        System.out.println("Задание 2.2");
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int d = 0; d < arr2.length; d++)
            if (d != arr.length -1) {
                System.out.print(arr2[d] + ", ");
            } else  {
                System.out.print(arr2[d]);
            }

        //Задание 2.3
        System.out.println();
        System.out.println("Задание 2.3");
        int[] app2 = {5, 7, 8};
        for (int a = 0; a < app2.length; a++)
            if (a != app2.length - 1) {
                System.out.print(app[a] + ", ");
            } else {
                System.out.print(app2[a]);
            }

        //Задание 3
        // Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента
        // массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива
        // располагаются на одной строчке, а элементы другого массива – на другой.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        // Если во втором задании в консоль у вас вывелся результат
        // 1, 2, 3
        // 1.57, 7.654, 9.986
        // *произвольные элементы третьего массива*
        // То в третьем задании результат должен быть
        // 3, 2, 1
        // 9.986, 7.654, 1.57
        // *произвольные элементы третьего массива в обратном порядке*

        //Задание 3.1
        System.out.println();
        System.out.println("Задание 3.1");
        int[] weight3 = new int[3];
        weight3[0] = 1;
        weight3[1] = 2;
        weight3[2] = 3;
        int start = weight3.length - 1;
        while (start >= 0) {
            if (start != 0) {
                System.out.print(weight3[start] + ", ");
            } else {
                System.out.print(weight3[start]);
            }
            start--;
        }

        //Задание 3.2
        System.out.println();
        System.out.println("Задание 3.2");
        double[] arr3 = {1.57, 7.654, 9.986};
        int start1 = arr3.length - 1;
        while (start1 >= 0) {
            if (start1 != 0) {
                System.out.print(arr3[start1] + ", ");
            } else {
                System.out.print(arr3[start1]);
            }
            start1--;
        }

        //Задание 3.3
        System.out.println();
        System.out.println("Задание 3.3");
        int[] app3 = {5, 7, 8};
        int start2 = app3.length - 1;
        while (start2 >= 0) {
            if (start2 != 0) {
                System.out.print(app3[start2] + ", ");
            } else  {
                System.out.print(app3[start2]);
            }
            start2 --;
        }

        //Задание 4
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        // Распечатайте результат преобразования в консоль.
        System.out.println();
        System.out.println("Задание 4");

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;
            }
            System.out.println(weight[i]);
        }

    }
}



