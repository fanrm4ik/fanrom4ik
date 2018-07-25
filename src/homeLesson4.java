public class homeLesson4 {

    public static void main(String[]args){
        }
  //ДИАПАЗОН ЗАДАЧИ 10
// задача №1
    public static double H (double a, double b, double c){
        double H = a+b*c/2;
        return H;
    }

    //задача №2
    public static double H1 (double a, double b){
        double H1 = (Math.pow(a,2)+Math.pow(b,2))/2;
        return H1;
    }

    //задача №3
    public static double H3 (double a, double b, double c){
        double H3 = (a+b)/12*c%4+b;
        return H3;
    }

    //задача №4
    public static double H4 (double a, double b, double c){
        double H4 = (a-b*c)/(a+b)%c;
        return H4;
        }

        //задача №5
        public static double H5 (double a, double b, double cosC){
            double H5 = Math.abs(a-b)/Math.pow((a+b),3)-Math.toRadians(cosC);
            return H5;
        }

        //ДИАПАЗОН ЗАДАЧИ 11
        //задача №6
        public static double S1 (double a, double b){
            double S1 = 0.5*a*b;
            return S1;
        }
        public static double Per (double a, double b){
            double Per = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
            return Per;
        }

        //задача №7
        public static double S2 (double a, double b){
        double S2 = a*b;
        return S2;
        }

        public static double Per2 (double a, double b){
        double Per2 = a*2+b*2;
        return Per2;
    }
        //задача №8
        public static double S3 (double a, double b, double sin){
            double S3 = (a*b*Math.sin(1.0471975511965976)/2);
            return S3;
            }
         public static double c (double a, double b, double cos){
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(1.0471975511965976));
        return c;
    }
        public static double Per3 (double a, double b, double c){
        double Per3 = a+b+c;
        return Per3;
    }

    //задача №9
    public static double M (double r1, double r2, double r3){
        double M = (Math.PI*Math.pow(r1,3)*0.0007)+(Math.PI*Math.pow(r2,3)*0.0007)+(Math.PI*Math.pow(r3,3)*0.0007);
        return M;
        }

    //задача 12
    public static double KursDoll (double doll, double hrn){
        double KursDoll = doll*hrn;
        return KursDoll;
        }
    public static double KursHrn (double doll, double hrn){
        double KursHrn = doll/hrn;
        return KursHrn;
        }

}


