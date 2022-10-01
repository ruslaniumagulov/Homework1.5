public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Система, которую использует клиент, iOS");
        } else if (clientOS == 1) {
            System.out.println("Система, которую использует клиент, Android");
        } else {
            System.out.println("Система, которую использует клиент, не распознана! Дальнейшие действия для работы прекращены!");
        }

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для правильной работы, пожалуйста, используйте систему iOS или Android!");
        }
        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Ваша версия системы iOS подходит для корректной работы");
            } else {
            if (clientOS == 0 && clientDeviceYear < 2015)
                System.out.println("Версия системы iOS устарела. Установите облегченную версию приложения для iOS по ссылке");
            }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Ваша версия системы Android подходит для корректной работы");
            } else {
            if (clientOS == 1 && clientDeviceYear < 2015)
                System.out.println("Версия системы Android устарела. Установите облегченную версию приложения для Android по ссылке");
        }
        // Задание 3
        System.out.println("Задание 3");
        System.out.println("Программа, которая вычисляет, является ли год високосным");
        int year = 2021;

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        // Задание 4
        System.out.println("Задание 4");
        System.out.println("Программа вычесления срока доставки продукта компании (банковской карты)");
        double deliveryWithin = 95;
        double maxKmPerFirstDay = 20;
        double maxKmPerEveryNextDays = 40;
        double firstDayPerDelivery = 1;
        double nextDaysPerDelivery = ((deliveryWithin - maxKmPerFirstDay) / maxKmPerEveryNextDays);
        double deliveryTime = nextDaysPerDelivery + firstDayPerDelivery;
        if (Math.ceil(deliveryTime) <= 1) {
            System.out.println("Потребуется " + Math.ceil(deliveryTime) + " день");
        } else {
            System.out.println("Потребуется дней: " + Math.ceil(deliveryTime));
        }

    }
}