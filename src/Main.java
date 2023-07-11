public class Main {
    public static void main(String[] args) {

        int bill = 100;
        int put = 5500;
        boolean putmoney = put >= 1000;

        int bonus;
        if (putmoney) {
            bonus = put / 100;
        } else {
            bonus = (0);
        }
        int yourBonus = put / 100;
        int newBalance = bonus + bill + put;

        System.out.println();
        System.out.println("Начисленно бонусных рублей: " + bonus + " руб");
        System.out.println("Ваш баланс равен: " + newBalance + " руб");


    }
}