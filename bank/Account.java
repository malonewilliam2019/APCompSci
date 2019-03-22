public abstract class Account {

    protected int accNumber;
    protected double balance;
    protected String name;


    public void withdrawl(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void checkBalance(){
        System.out.printf("Your balance is $%d ",balance);
    }



}
