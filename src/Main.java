public class Main {
    public static void main(String[] args) {

        int bill = 100;
        int put = 2300;
        boolean putmoney = put >= 1000;

        int bonus;
        if (putmoney) {
            bonus = put/100;
        }else{
            bonus = (0);
        }
        int your_bonus = put/100;

        System.out.println("Ваш бонус: " + bonus +" руб");

    }
}