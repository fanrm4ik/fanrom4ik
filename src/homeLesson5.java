public class homeLesson5 {
    public static void main(String[] args) {
    }
        //задача №15
        public static void CheckIn ( int a){
            a = 4;
            int b = a % 2;
            if (b == 0) {
                System.out.println("четное");
            } else {
                System.out.println("нечетное");
            }

        }

        //задача №16

        public static void Train ( int a, int b, int s){
            a = 4; //speed 1
            b = 5; //speed 2
            s = 10; //long
            double c = a / 4; //время до поворота 1-го поезда (1 час)
            double d = b * 1;  //расстояние, которое проедет 2-й поезд за 1 час
            double e = s - (a * 1);  //расстояние которое нужно проехать 2-му поезду для столкновения с 1-м
            if (e >= d) {
                System.out.println("столкновение");
            } else {
                System.out.println("расходятся");
            }
        }

        // задача №17

        public static void CheckIn2 ( double x1, double y1, double r1, double x2, double y2, double r2){

            x1 = 2;
            x2 = 7;
            y1 = 4;
            y2 = 4;
            r1 = 2;
            r2 = 3;


            double a = y2 - y1;
            double b  = x2 - x1; // расстояние между центрами окружностей, так как y1 и y2 имеют равные значения
            double c = r1 + r2; // сумма длин радиусов


            if (b > c) {
                System.out.println ("не могут столкнуться");
            } else {
                System.out.println ("могут столкнуться");
            }
        }


    }

