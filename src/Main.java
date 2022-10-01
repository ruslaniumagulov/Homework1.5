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

    }
}