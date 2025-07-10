package C2TC_CORE_JAVA_PROGRAM.src.Day14.synchronization;

public interface Bank {
    int MINBAL=5000; //fields are static and final
    static final int DAILY_LIMIT=25000;
    public abstract void deposit(int amt) throws DepositLimitExceedsException;
    void withdraw(int amt)throws InsufficientBalanceException; //public and abstract
}
