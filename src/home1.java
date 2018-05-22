public class home1 {
    public static void main(String [] args) {

        //задача 1

        double a = 3;
        double b = 4;
        double c = 7;
        double g = a+b*c/2;
        System.out.println(g+"ответ 1");

        //задача 2

        double a2 = 5;
        double b2 = 6;
        double c2 = (Math.pow(5,2)+Math.pow(6,2))/2;
        System.out.println(c2+"ответ 2");

        //задача 3

        double a3 = 7;
        double b3 = 9;
        double c3 = 10;
        double g3 = (a3+b3)/12*c3%4+b3;
        System.out.println(g3+"ответ 3");

        //задача 4

        double a4 = 11;
        double b4 = 13;
        double c4 = 17;
        double g4 = (a4-b4*c4)/(a4+b4)%c4;
        System.out.println (g4+"ответ 4");

        //задача 5

        double a5 = 12;
        double b5 = 13;
        double cosC = 60;
        double c5 = a5+b5;
        System.out.println(c5);
        double g5 = Math.abs(a5-b5)/Math.pow(25,3)- Math.toRadians(60);
        System.out.println(g5+"ответ 5");



    }
}
