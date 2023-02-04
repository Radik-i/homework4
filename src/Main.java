public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        short age = 20;
        System.out.println("Если возраст человека равен " + age);
        if (age < 18) System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        else System.out.println("он совершеннолетний");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        short temp = 20;
        System.out.println("На улице " + temp + " градусов");
        if (temp <= 5) System.out.println("На улице холодно, нужно надеть шапку");
        else System.out.println("Сегодня тепло, можно идти без шапки — если температура воздуха выше 5 градусов");
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 70;
        System.out.println("Если скорость " + speed + " км/ч, то");
        if (speed <= 60) System.out.println("Можно ездить спокойно");
        else System.out.println("Придется заплатить штраф");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        short age1 = 3;
        System.out.println("Если Вам " + age1 + " лет");
        if (age1 >= 2 && age1 <= 6) System.out.println("Вам нужно ходить в детский сад");
        else if (age1 >= 7 && age1 <= 18) System.out.println("Вам нужно ходить в школу");
        else if (age1 >= 19 && age1 <= 24) System.out.println("Ваше место в университете");
        else System.out.println("Вам пора ходить на работу");

        System.out.println();
}
    public static void task5() {
        System.out.println("Задача 5");
        short age2 = 14;
        System.out.println("Если возраст ребенка равен " + age2 + " лет, то ему");
        if (age2 < 5 ) System.out.println("Нельзя кататься на аттракционе");
        else if (age2 >= 5 && age2 < 14) System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        else System.out.println("Можно кататься на аттракционе без сопровождения взрослого");

        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        short numOfPas = 60;
        System.out.println("Если число пассажиров " + numOfPas + " человек");
        if (numOfPas < 60 ) System.out.println("В вагоне еще есть сидячие и стоячие места");
        else if (numOfPas >= 60 && numOfPas < 102) System.out.println("В вагоне еще есть стоячие места");
        else System.out.println("В вагоне мест больше нет");
        System.out.println();
    }

   public static void task7() {
        System.out.println("Задача 7");
        int one=5;
        int two=12;
        int three=20;
        if (one > two && one > three) System.out.println("Самое большое число " + one);
        else if (two > one && two > three) System.out.println("Самое большое число " + two);
        else System.out.println("Самое большое число " + three);
        System.out.println();
    }
}