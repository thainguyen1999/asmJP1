package assignmentJP1.ex1;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank(1000, 10);
        double interest = b.calculateInterest(b.balance,b.rate);
        System.out.println("Your grandfather's profit is:" + Math.round(interest*100.0)/100.0);
    }
}
