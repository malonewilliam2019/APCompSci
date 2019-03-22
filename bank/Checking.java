public class Checking  extends Account{

    Checking (int newAccNumber, double newBalance,String newName) {
        int accNumber = newAccNumber;
        double balance = newBalance;
        String name=newName;
        System.out.printf("Account number %d by %d created a checking account", newAccNumber, newName);
    }
}
