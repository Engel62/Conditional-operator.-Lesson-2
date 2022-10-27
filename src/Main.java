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
        // Заданеи 3
        System.out.println(" Задание 3");



    }
}