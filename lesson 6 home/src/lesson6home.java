import java.util.Scanner;


public class lesson6home {

    // Задача № 19
    public static void main(String[] args) {
       /* try (Scanner sc = new Scanner(System.in)) {
            System.out.println("выбери направление от 1 до 3: 1 - налево пойдешь, сам умрешь, 2. Направо - коня потеряешь, 3. Прямо - клад найдешь ");
            int a, res = 1;
            a = sc.nextInt();

            if (a == 1) {
                System.out.println("беда-печаль");
            }
            if (a == 2) {
                System.out.println("да здравствует ЗОЖ!");
            }
            if (a == 3) {
                System.out.println("рубль бережет копейка");
            }
            if (a>3) {
                System.out.println("не ломай програму и начни с начала");


            }

        }*/


        // Задача № 20

        try (Scanner sc = new Scanner(System.in)) {
            int a, res = 1;
            int b;
            int c;
            int d;
            System.out.println("выбери размер погружаемого груза: длина");
            a = sc.nextInt();
            if (a > 1) {
                System.out.println("не пихай невпихуемое");
            }
            System.out.println("выбери размер погружаемого груза: ширина");
            b = sc.nextInt();
            if (b > 1) {
                System.out.println("не пихай невпихуемое");
            }
            System.out.println("выбери размер погружаемого груза: высота");
            c = sc.nextInt();
            if (c > 1) {
                System.out.println("не пихай невпихуемое");
            }
            System.out.println("выбери размер погружаемого груза: вес");
            d = sc.nextInt();
            if (d > 1) {
                System.out.println("платформа сломалась");
            }



            if (a == 1 && b == 1 && c == 1 && d == 1) {
                System.out.println("все зашло, по коням...");
            }
        }

    }
}


