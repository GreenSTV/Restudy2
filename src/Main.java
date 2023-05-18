public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int money = 120;
        int bonus = money / amount;
        int total1 = money + bonus;
        if (money > 1000) {
            System.out.println(bonus);
            System.out.println(total1);
        }
        else{
            System.out.println(0);
            System.out.println(total1);
        }

        }
}
