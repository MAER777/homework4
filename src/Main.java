public class Main {
    public static void main(String[] args) {
        test();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6_1();
        task6_2();
        task7();
    }

    public static void test() {System.out.println("Тест");
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь войти");
        } else {
            System.out.println("Ты не можешь войти");
        }
        if (age > 18 && age < 21) {
            System.out.println("Можешь водить, но не можешь пить алкоголь");
        }
        if (age < 7 || age > 18) {
            System.out.println("Я думаю, ты не ходишь в школу");
        }
        boolean skyIsClear = true;
        if (skyIsClear) {
            System.out.println("Небо чистое");
        }
        //
        boolean canNotGoToSchool = age < 7 || age > 18;
        if (canNotGoToSchool) {
            System.out.println("Я думаю, ты не ходишь в школу");
        } else {
            System.out.println("Ты школьник");
        }
    }

    public static void task1() {System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Вы не совершеннолетний, нужно немного подождать");
        }
    }

    public static void task2() {System.out.println("Задача 2");
        int temperature = -10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов ,нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов ,можно идти без шапки");
        }
    }

    public static void task3() {System.out.println("Задача 3");
        int speed = 66;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придеться заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {System.out.println("Задача 4");
        int age = 26;
        boolean kindergarten = age >= 2 && age <= 6;
        boolean shool = age >= 7 && age <= 18;
        boolean university = age > 18 && age <= 24;
        boolean work = age > 24;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский садик");
        } else if (shool) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (university) {
            System.out.println("Если возраст человека равен " + age + " , то нужно ходить в университет");
        } else if (work) {
            System.out.println("Если возраст человека равен " + age + " , то пора ходить на работу");
        }
    }

    public static void task5() {System.out.println("Задача 5");
        int age = 14;
        boolean kids = age <= 4;
        boolean teenager = age >= 5 && age <= 13;
        boolean adult = age >= 14;
        if (kids) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе");
        } else if (teenager) {
            System.out.println("Если возвраст ребенка равен " + age + " , то он может кататься только с сопровождения взрослого");
        } else if (adult) {
            System.out.println("Если ребенок старше " + age + " лет, то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6_1() {System.out.println("Задача 6.1");
        int place = 103;
        boolean zeroPleace = place <=0;
        boolean allPlace = place > 102;
        boolean sittingPlace = place >= 1 && place<= 60;
        boolean strandingPlace = place > 60 && place <= 102;
        if (allPlace) {
            System.out.println("Мест нет");}
        else if (zeroPleace) {
            System.out.println("Выберите место");}
        else if (sittingPlace) {
            System.out.println("Вы выбрали сидячее место под номером " + place + " из 60 сидячих (Общее кол-во мест 102)");}
        else if (strandingPlace) {
            System.out.println("Вы выбрали стоячее место под номером " + place + " из 102 доступных мест (Из них 60 сидячих которые уже заняты другими пользователями)");}
    }
    public static void task6_2() {System.out.println("Задача 6.2");
        int place = 103;
        int sittingPlace = 60;
        int stradingPlace = 102;
        if (place <= sittingPlace) {
            System.out.println("Выбрано сидячее место ");}
        else if (place > sittingPlace && place <= stradingPlace) {
            System.out.println("Выбрано стоячее место");} else if (place>stradingPlace) {
            System.out.println("Мест нет");}
    }
    public static void  task7() {System.out.println("Задача 7");
        int one = 4;
        int two = 2;
        int three = 3;
        if (one> two && one > three) {
            System.out.println("Первое число больше второго и третьего");} else if (two > one && two > three) {
            System.out.println("Второе число больше первого и третьего");} else if (three > one && three > two) {
            System.out.println("Третье число больше первого и второго");}
    }
}