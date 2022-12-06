import java.time.LocalDate;
class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    //метод для 1 задания
    public static int checkYear (int year) {
        if (year%4 == 0 && year%100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год");
        }
        return year;
    }
    //метод для 2 задания
    public static int checkVersion (int clientOs, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0) {
            if (deviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS.");
            } else {
                System.out.println("Установите lite версию приложения для iOS по ссылке");
            }
        }    else {
            if (deviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android.");
            } else {
                System.out.println("Установите lite версию приложения для Android по ссылке");
            }
        }
        return clientOs + deviceYear;
    }
    //метод для 3 задания
    public static int countDaysForDelivery (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займёт сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займёт 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Доставка займёт 3 дня");
        } else {
            System.out.println("Доставка займёт больше 3 дней.");
        }
        return deliveryDistance;
    }


    public static void task1() {
        int year = 2020;
        checkYear(year);
    }
    public static void task2() {
        int clientOs = 1;
        int deviceYear = 2020;
        checkVersion(clientOs, deviceYear);
            }
    public static void task3() {
        int deliveryDistance = 95;
        countDaysForDelivery(deliveryDistance);
    }
}