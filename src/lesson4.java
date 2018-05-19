public class lesson4 {

    public static void main(String[]args){
        System.out.println("площадь прямоугольника" +perim(6,7)+ func1(5)+func2(60));

    }
    /* написать функцию расчета площади прямоугольника

    функцию расчета x^3+x^2+1

    функцию расчета sin войного угла

    вызвать функцию в мейне из первого задания для значений 1 и 2 и вывести результат
    
     */

    public static double perim (double a7, double b7) {
        double pow = a7*b7;
        return pow;
        }

        public static double func1 (double x){
        double y = Math.pow(x,3) + Math.pow(x,2)+1;
        return y;
    }

        public static double func2 (double pg){
        double pg2 = Math.sin(2*Math.toRadians(pg));
        return pg2;


        }
}


