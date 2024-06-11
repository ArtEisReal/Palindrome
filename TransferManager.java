package bankAccount;

/**
 * 
 * @Author Artin, Sumru
 * @Version 10.06.2024
 */

public class TransferManager extends CurrentAccount{
    
    /**
     * empty consturctor 
     */
    TransferManager() {
        
        super("", 0);
    }
    
    /**
     * Trasnfers money from one account to another
     * @param fromAccount
     * @param toAccount
     * @param amount
     */
    public void transfer(CurrentAccount fromAccount, CurrentAccount toAccount, long amount) {
        
        assert amount >= 0: "cant transfer negativ balance";
        assert fromAccount.getAccountBalance() >= amount: "you dont have enough money";
        
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
    
}
