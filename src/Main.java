public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }


    public static void task1() {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("«Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2023;

        if (clientOS == 0) {
            if (clientOS < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке».");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("является високосным");
        } else {
            System.out.println("не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;


        if (deliveryDistance <= 20) {
            System.out.println("Потребуется день что бы доставить груз на " + deliveryDistance + " км.");
        } else if
        (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется  2 дня для доставки на " + deliveryDistance + " км.");
        } else if
        (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется  3 дня для доставки на " + deliveryDistance + " км.");
        } else {
            System.out.println("Доставка нет на " + deliveryDistance + " км. слишком большое расстояние");
        }
    }


    public static void task5() {
        int  monthNumber=12;
        switch (monthNumber) {

            case 1:
                System.out.println(monthNumber + "-й месяц (он же январь) принадлежит к сезону зима.");break;
            case 2:
                System.out.println(monthNumber + "-й месяц (он же февраль) принадлежит к сезону зима.");break;
            case 3:
                System.out.println(monthNumber + "-й месяц (он же март) принадлежит к сезону весна.");break;
            case 4:
                System.out.println(monthNumber + "-й месяц (он же апрель) принадлежит к сезону весна.");break;
            case 5:
                System.out.println(monthNumber + "-й месяц (он же май) принадлежит к сезону весна.");break;
            case 6:
                System.out.println(monthNumber + "-й месяц (он же июнь) принадлежит к сезону лето.");break;
            case 7:
                System.out.println(monthNumber + "-й месяц (он же июль) принадлежит к сезону лето.");break;
            case 8:
                System.out.println(monthNumber + "-й месяц (он же август) принадлежит к сезону лето.");break;
            case 9:
                System.out.println(monthNumber + "-й месяц (он же сентябрь) принадлежит к сезону осень.");break;
            case 10:
                System.out.println(monthNumber + "-й месяц (он же октябрь) принадлежит к сезону осень.");break;
            case 11:
                System.out.println(monthNumber + "-й месяц (он же ноябрь) принадлежит к сезону осень.");break;
            case 12:
                System.out.println(monthNumber + "-й месяц (он же декарь) принадлежит к сезону зима.");break;
                default:
                System.out.println(monthNumber + " такого месяца не существует");}}

}