import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {
        System.out.println(checkYaer(2012));
        System.out.println(checkYearAndOperationSystem(1, 2015));
        System.out.println(calculateDaysOfDelivery(43));
    }

    public static String checkYaer(int year){

        String result = "";

        if (year % 4 == 0 && year > 1584 && (year % 400 == 0 && year % 100 != 0)) {
            result += year + " год високосный";
        }

        else{
            result += year + " год не является високосным";
        }

        return result;

    }

    public static String checkYearAndOperationSystem(int operationSystem, int yearOfProductDevice){
        int currentYear = LocalDate.now().getYear();

        if (operationSystem == 0){
            if (currentYear >= yearOfProductDevice){
                return "Установите приложение для IOS по ссылке";
            }

            else {
                return "Установите облегченную версию приложения для IOS по ссылке";
            }
        }

        else if (operationSystem == 1){
            if (currentYear >= yearOfProductDevice){
                return "Установите приложение для Android по ссылке";
            }

            else {
                return "Установите облегченную версию приложения для Android по ссылке";
            }
        }

        else {
            return "Операционная система вашего телефона не поддерживается";
        }
        }
    public static String calculateDaysOfDelivery(int deliveryDistance){

        if (deliveryDistance <= 20){
            int dateOfDelivery = 1;
            return "Доставка займет " + dateOfDelivery;

        }
        else if (20 < deliveryDistance && deliveryDistance <= 60) {
            int dateOfDelivery = 2;
            return "Доставка займет " + dateOfDelivery;

        }
        else if (60 < deliveryDistance && deliveryDistance <= 100) {
            int dateOfDelivery = 3;
            return "Доставка займет " + dateOfDelivery;

        }
        else {
            return "Мы не осуществляем доставки до вас, слишком далеко";
        }
    }
    }
