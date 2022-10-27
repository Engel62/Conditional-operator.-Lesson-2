public class Main {
    public static void main(String[] args) {
        int age = 12;
        if (age == 18) {
            System.out.println(" С окончанием школы!");
        } else if (age == 21) {
            System.out.println(" Теперь ты можешь пить! ");
        } else if (age == 7) {
            System.out.println("Иди в школу!");
        } else {
            System.out.println(" Пока сказат  нечего ");
        }
        // Задание 1
        System.out.println(" Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");

        // Задание 2
        System.out.println(" Задание 2");

        int clientDiveceYear = 2015;
        if (clientOS == 0 && clientDiveceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 0 && clientDiveceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (clientOS == 1 && clientDiveceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        else if (clientOS == 1 && clientDiveceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        // Задание 3
        System.out.println(" Задание 3");

        int year = 2021;
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(+year + " год является високосным");
        } else if (year % 100 == 0 || year % 400 != 0) {
            System.out.println(+year + " год не является високосным");
        }
        // Задание 4
        System.out.println(" Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней: 1");
        else if (20 <= deliveryDistance && deliveryDistance < 60)
            System.out.println("Потребуется дней: 2");
        else if (60 <= deliveryDistance && deliveryDistance < 100)
            System.out.println("Потребуется дней: 3");
        else if (deliveryDistance > 100)
            System.out.println("Доставка не осуществляется");

    }
}