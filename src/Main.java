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
        int your_bonus = put / 100;
        int new_balance = bonus + bill + put;

        System.out.println();
        System.out.println("Начисленно бонусных рублей: " + bonus + " руб");
        System.out.println("Ваш баланс равен: " + new_balance + " руб");


    }
}