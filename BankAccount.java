package bankAccount;

/**
 * 
 * @Author Artin, Sumru
 * @Version 10.06.2024
 */

public class BankAccount {
    
    
    private String id;
    private long balance;
    
    /**
     * 
     * constructor (sets id to id, balance to 0)
     * @param id
     */
    public BankAccount(String id){
        
        this.id = id;
        this.balance = 0;
    }
    
    /**
     * constructor
     * @param id
     * @param startingBalance
     */
    public BankAccount(String id, long startingBalance){
        
        assert startingBalance >= 0;
        this.id = id;
        this.balance = startingBalance;
        
    }
    
    /**
     * withdraw money from ur balance
     * @param amount
     */
    public void withdraw(long amount) {
        
        assert amount >= 0: "cant transfer negativ balance";
        assert getAccountBalance() >= amount: "you dont have enough money";
        
        balance -= amount;
    }
    
    /**
     * deposit money into your balance
     * @param amount
     */
    public void deposit(long amount) {
        
        balance += amount;
    }
    
    /**
     * gets your balance
     * @return balance
     */
    public long getAccountBalance() {
        
        return balance;
    }
    
    /**
     * gets your id
     * @return
     */
    public String getAccountId() {
        
        return id;
    }
    
    /**
     * 
     * gives u all information needed (id, balance) of Bank Account
     * @return string
     */
    @Override
    public String toString() {
        
        return String.format("BankAccount id='%s', balance='%d'", id, balance);
    }
    
}


