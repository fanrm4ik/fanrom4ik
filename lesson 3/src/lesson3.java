public class lesson3 {
    public static void main(String[] args) {
        double a = 1/3;
        double b = ((double)1)/3; // подведение
        double c = 1.0/3;
        double d = 1d/3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        long a1 = 250, a2 = 10000000, a3 ;
        short b1 = 100, b2 = 31000, b3 ;
        int c1 = 150, c2 = 32000, c3  ;

        System.out.println(a + "," + b + "," + c);

        c2 = (int)a2;
        System.out.println(c2);

        b2 = (short)c2;
        System.out.println(b2);

        b3 = (short) a;
        System.out.println(b3);
        b3 = (short) b;
        System.out.println(b3);

        b3 = (short) d;
        System.out.println(b3);

           int q1 = 256;
           byte w1 = (byte) q1;  // приведение типов
             System.out.println(w1);

        int q2 = 257;
        byte w2 = (byte) q2;
        System.out.println(w2);

        int q3 = 127;
        byte w3 = (byte) q3;
        System.out.println(w3);

        int q4 = 128;
        byte w4 = (byte) q4;
        System.out.println(w4);

  double v = 5;
  double n = 5;

  double vn = n*v;
  System.out.println (vn);
  double z = 4*v;
  System.out.println(z);

double l = 5;
double k = 10;

double lk = l*k;
        System.out.println(lk);
        double per = 2*k + 2*l;
        System.out.println(per);

        double diagsquar = l*l + k*k;
        System.out.println(diagsquar);
        double sqrt = Math.sqrt (diagsquar);
        System.out.println (sqrt);


        double R = 5;
        double sqrtR = Math.PI * (R*R);
        System.out.println(sqrtR);

        double Lcircle = Math.PI * (2*R);
        System.out.println(Lcircle);


        double A = 5;
        double sqrtTriangle = (A*A*Math.sqrt(3))/4;
        System.out.println(sqrtTriangle);

        double B = 10;
        double C = 5;
        double SinRad = Math.toRadians(90);
        double sqrtParralel = B*C*SinRad;
        System.out.println (sqrtParralel);

        //домашка 5 задача

        double a4 = 5;
        double b4 = 4;
        double c4 = Math.cos(60);
        System.out.println(c4 + "косинус угла");
        double module1 = Math.abs(a4-b4);
        System.out.println(module1 + "модуль");
        double sum1 = a4+b4;
        double kub1 = Math.pow(sum1,3);
        System.out.println (kub1 +   "куб");
        double answer = module1/kub1-c4;
        System.out.println(answer);

        // задача 6

        double a5 = 7;
        double b5 = 8;
        double c5 = Math.cos(90);

        double S = 0.5*a5*b5;
        System.out.println (S +"площадь");

        double d5pow = Math.pow(7,2) + Math.pow(8,2);
        System.out.println(d5pow);
        double d5 = Math.sqrt(d5pow);
        System.out.println (d5);

        double per1 = a5 + b5 + d5;
        System.out.println(per1 + "периметр");

        /*   задача 7

        первая вершина с координатами (0;5), вторая - (7;0)
        от значение вершины отнимаем нулевую точку ординат и получаем длину стороны */
        
        double a6 = 7;
        double b6 = 5;
        double S2 = a6*b6;
        System.out.println (S2+"площадь");
        double perimetr2 = a6*2+b6*2;
        System.out.println(perimetr2+"периметр");


        // задача 8

        double a7 = 8;
        double b7 = 9;
        double angle = Math.toRadians(60);
        System.out.println(angle);
        double SinAngle = Math.sin(1.0471975511965976);
        System.out.println(SinAngle);
        double S3 = (a7*b7*SinAngle)/2;
        System.out.println(S3 + "площадь");
        double CosAngle = Math.cos(1.0471975511965976);
        System.out.println(CosAngle);
        double c7 = Math.sqrt(Math.pow(a7,2)+Math.pow(b7,2)-2*a7*b7*CosAngle);
        System.out.println(c7 + "длина третьей стороны");
        double perimetr3 = a7+b7+c7;
        System.out.println(perimetr3 + "периметр");


        // задача 9

        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double v1 = Math.PI*Math.pow(r1,3);
        System.out.println(v1);
        double v2 = Math.PI*Math.pow(r2,3);
        System.out.println(v2);
        double v3 = Math.PI*Math.pow(r3,3);
        System.out.println(v3);   //плотность из кг перевел в т (0.0007)
        double mass1 = v1*0.0007;
        System.out.println(mass1);
        double mass2 = v2*0.0007;
        System.out.println(mass2);
        double mass3 = v3*0.0007;
        System.out.println(mass3);
        double FullMass = mass1+mass2+mass3;
        System.out.println(FullMass+"масса снеговика");

    }
}
