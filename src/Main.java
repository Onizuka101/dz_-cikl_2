public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();


    }
    public static void task1() {
    int q = 0;
    int i = 15000;
    while (q < 2459000){
        q=q+i;
        System.out.println(q);
    }
    }
    public static void task2() {
        int q = 0;
        int i = 1;
        while (q < 10){
            q=q+i;
            System.out.print ( q );}

            System.out.println();

        for (int w = 10; 0 < w; w = w - 1)
                System.out.print ( w ) ;

    }
    public static void task3() {
        int q = 12_000_000;
        int a = 17;
        int c = 8;
        int d = a-c;
        int w = 1000;
        int y = w+d;
            for (int i = 1; i <= 10; i = i + 1){
            q=q/w*y;
                System.out.println ("«Год" + i +" ,численность населения составляет" + q + "»" );}
    }
    public static void task4() {

        int w = 15000;
        int i = 1;
        for ( ;w< 12000000; i++){
            w=w+7*w/100;
            w=w+i;
            System.out.println("месяц" + i + "сумма"+ w);
        }
        System.out.println("всего мечяцов" + i);
    }
    public static void task5() {

        int w = 15000;
        int i = 1;
        for ( ;w< 12000000; i++){
            w=w+7*w/100;
            w=w+i;
            if (i % 6 == 0)
            System.out.println("месяц" + i + "сумма"+ w);
        }
        System.out.println("всего мечяцов" + i);
    }
    public static void task6() {

        int w = 15000;
        int i = 1;
        for ( ;i< 108; i++){
            w=w+7*w/100;
            w=w+i;
            if (i % 6 == 0)
                System.out.println("месяц" + i + "сумма"+ w);
        }
        System.out.println("всего мечяцов" + i);
    }




}