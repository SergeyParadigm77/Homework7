public class Main {
    public static void main(String[] args) {
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
        int vklad = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + vklad;
            month++;
            System.out.println("Месяц " + month + " сумма накомплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        byte i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int populationTotal = 12_000_000;
        byte populationPlusThousand = 17;
        byte populationMinusThousand = 8;
        for (byte timeYears = 1; timeYears <= 10; timeYears++) {
            populationTotal = populationTotal + (populationPlusThousand - populationMinusThousand) * populationTotal / 1000;
            System.out.println("Год " + timeYears + ", численность населения составляет " + populationTotal);
        }
    }

    public static void task4() {
        int vklad = 15_000;
        short i = 0;
        while (vklad < 12_000_000) {
            i++;
            vklad += vklad * 7 / 100;
            System.out.println("Сумма накоплений за " + i + " месяц равна " + vklad + " рублей");
        }
        System.out.println("Чтобы собрать " + vklad + " рублей Василию нужно будет копить " + i + " месяца");
    }

    public static void task5() {
        int vklad = 15_000;
        short i = 0;
        while (vklad < 12_000_000) {
            i++;
            vklad += vklad * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("Сумма накоплений за " + i + " месяц равна " + vklad + " рублей");
            }
        }
        System.out.println("Чтобы собрать " + vklad + " рублей Василию нужно будет копить " + i + " месяца");
    }

    public static void task6() {
        int vklad = 15_000;
        short i = 0;
        while (i < 12 * 9) {
            i++;
            vklad += vklad * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("Сумма накоплений за " + i + " месяц равна " + vklad + " рублей");
            }
    }
}
    public static void task7() {
        for (int friday = 1;  friday <= 31; friday += 7)
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    public static void task8() {
        int yearBegin = 2023 - 200;
        int yearEnd = 2023 + 100;
        for (short yearComet = 0;  yearComet <= yearEnd; yearComet += 79)
            if (yearComet >= yearBegin)
                System.out.println(yearComet);
    }
}