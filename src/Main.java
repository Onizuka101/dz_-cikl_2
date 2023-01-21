public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }
    public static void task1() {
    int capital = 0;
    int monthlySavings = 15000;
    while (capital < 2459000){
        capital=capital+monthlySavings;
        System.out.println(capital);
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
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int populationGrowth = birthRate-mortality;
        int thousand = 1000;
        int populationGrowthPerThousand = thousand+populationGrowth;
            for (int i = 1; i <= 10; i = i + 1){
                population=population/thousand*populationGrowthPerThousand;
                System.out.println ("«Год" + i +" ,численность населения составляет" + population + "»" );}
    }
    public static void task4() {

        int capital = 15000;
        int month = 1;
        for ( ;capital< 12000000; month++){
            capital=capital+7*capital/100;
            capital=capital+month;
            System.out.println("месяц" + month + "сумма"+ capital);
        }
        System.out.println("всего мечяцов" + month);
    }
    public static void task5() {

        int capital = 15000;
        int month = 1;
        for ( ;capital< 12000000; month++){
            capital=capital+7*capital/100;
            capital=capital+month;
            if (month % 6 == 0)
            System.out.println("месяц" + month + "сумма"+ capital);
        }
        System.out.println("всего мечяцов" + month);
    }
    public static void task6() {

        int capital = 15000;
        int month = 1;
        for ( ;month< 108; month++){
            capital=capital+7*capital/100;
            capital=capital+month;
            if (month % 6 == 0)
                System.out.println("месяц" + month + "сумма/"+ capital);
        }
        System.out.println("всего мечяцов" + month);
    }
    public static void task7() {
        int friday = 1;
        int week = 7;
        do {  friday = friday + week;
            System.out.println(friday);
        } while (friday <= 31);

    }
    public static void task8() {
        int comet = 1975;
        int interval = 79;
        while (comet < 2075){
            comet=comet+interval;
            System.out.println(comet);
        }
        while (comet > 1775){
            comet=comet-interval;
            System.out.println(comet);
        }
    }

}