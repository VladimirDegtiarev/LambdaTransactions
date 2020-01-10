import java.util.ArrayList;
import java.util.Map;

public class Account {
    private String number;
    private long balance;

    public Account(String number, long balance) {
        this.number = number;
        this.balance = balance;
    }

    // TODO: добавить геттеры и сеттеры

    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "\nAccount " + number + ", balance: " + balance;
    }

}