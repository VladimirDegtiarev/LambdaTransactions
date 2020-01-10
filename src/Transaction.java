public class Transaction {
    private String uuid;
    private long sum;
    private Account account;

    public Transaction(String uuid, long sum, Account account) {
        this.uuid = uuid;
        this.sum = sum;
        this.account = account;
    }
    // TODO: добавить геттеры и сеттеры


    public String getUuid() {
        return uuid;
    }

    public long getSum() {
        return sum;
    }

    public Account getAccount() {
        return account;
    }

    public String getAccountNumber() {
        return account.getNumber();
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "\nTransaction " + uuid + ", sum: " + sum + " " + "Account number: " + this.getAccountNumber();
    }

}