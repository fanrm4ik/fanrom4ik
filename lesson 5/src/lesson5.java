public class lesson5 {

    public static void main (String[]args){
        double a = 5;
        double b = 7;
    }

    public static double S (double a, double b){
        double S = (a*b)/2;
        return S;
    }

    public static double S1 (double a, double b){
        double S1 = a*b;
        return S1;
    }
    public static double squareIf (int a, int b){
        if (a%2==0){
            return S (a,b);
        }
        else {
            return S1 (a,b);
        }
    }

    public static void variabl (int a){

    }
}
