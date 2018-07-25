import java.util.Random;
import java.util.Scanner;

public class lesson9 {


  /*  задание 1

    Написать программу, которая выводит числа от 20 до 1 в обратном порядке используя цикл "for" */

   /* public static void main (String [] args) {

        Task3();

    }

       /* for (int a=20;a>0;a--){

            System.out.println (a);
            }  */

     /*  Random rnd = new Random();
       int N = 10;
       int randNumber = rnd.nextInt(N);
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N)); */



     /*
        Random rnd = new Random();
        int h = 10;
        int randNumber = rnd.nextInt(h);
   for (int i = 0; i < 5; i++){

            System.out.println(i + " " + rnd.nextInt(11));
        }
*/
    /*Написать программу угадай число, которая при запуске выбирает число и предлагает пользователю его угадать прося ввести число и говоря
                юольше ли оо или меньше. Если полльзователь угадал, программазаыершается.
                 Подсказка: лучше использовать цикл do-while для ввода числа с консоли. Случайное число взять из класса Random.
                 Числа читать с консоли через  Scanner.*/


       /* public static void Task3 () {
            Random rnd = new Random();

            int N = 10; // Bound
            int Number = rnd.nextInt(N) + 1; //[1,10]
            //загадали случайное число

            try (Scanner sc = new Scanner(System.in)){
                //ввод числа с консоли

                int humanNumber;

                do {
                    System.out.println ("введите число");
                    humanNumber = sc.nextInt(); //получили число
                    if(humanNumber < Number){
                        System.out.println ("Ты не угадал. Мое число больше.");
                    }
                    if (humanNumber > Number){
                        System.out.println("Ты не угадал. Мое число меньше.");
                    }
                } while (Number != humanNumber );
                System.out.println("Ты угадал");


            }

   }
   }
        }*/




/* public static void main (String[] args){
    int [] A = new int [3];
    A[0] = 7;
    A[1] = 6;
    A[2] = 5;
    int sum =0;
    //int a = A[0];
    for (int i = 0; i<A.length; i++){
        System.out.println(A[i]);
        sum+= A[i];


    }
    System.out.println (sum);
   // System.out.println(A[0] + " " + A); */


   /* public static void main(String[] args) {
        int[] A = inputArray();
        printArray(A);
        ArrayFind (A);
    }

    public static int[] inputArray() {
        Scanner t1 = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве");
        int Z = t1.nextInt();
        int[] arr = new int[Z]; // обозначение количества элементов в массиве, в скобках количество эллементов в массиве.
        /* for (int Z;Z>0;Z--) */

      /*  for (int index = 0; index < arr.length; index++) {


            System.out.println("введите элемент " + index);  // (+ нужен обязательно, он соединяет)
            arr[index] = t1.nextInt(); // в клавдратных скобках номер элемента в мвссиве


        }

        return arr;

    }

    // public static int[] randomArray ()


    public static void printArray(int[] arr) {
      for (int index = 0; index < arr.length; index++){
          System.out.println (arr[index]);
      }



    }

    public static boolean ArrayFind(int[]arr, int value){ */

    public static void main(String[] args) {


        int[] massive = new int[3];
        massive[0] = 9;
        massive[1] = 12;
        massive[2] = 14;


        int S = arraySum(massive);
        System.out.println(S);

        int D = arrayCount(massive);
        System.out.println(D);

        printArray(massive);
        /* написать функцию, которая принимает массив в параметрах и возвращает сумму всех элементов */
    }

    public static int arraySum(int[] A) {

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }


        return sum;


    }


    // Написать функцию, которая подсчитает количество не нулевых элементов в массиве, который передан в параметрах функции.


    public static int arrayCount(int[] A) {
        int countNotNull = 0; // количество ненулевых элементов

        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                countNotNull++;

            }


        }
        return countNotNull;


    }


    // Создать функцию, которая выводит весь массив на экран. В виде [1,2,3,4]
    public static void printArray(int[] A) {
        System.out.print("[");                // строкой явлеется местом между ""
        for (int i = 0; i < A.length; i++) {


            System.out.print(A[i] + " ");
        }
        System.out.print("]");
    }


//Написать функцию, которая отнимает от каждого элемента массива заданное число. В мейне вызвать эту функцию с масиивом и потом вызвать printArray().


    public static void arrayDecrease(int[] A, int decreaseValue){

    for (int i =0; i<A.length; i++){


    }
    }


}



































/*задание
создать массив из 3 элементов и найти сумму всех его элементов
Элементы задать вручную
используя цикл*/


