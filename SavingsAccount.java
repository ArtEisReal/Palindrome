package bankAccount;

/**
 * 
 * @Author Artin, Sumru
 * @Version 10.06.2024
 */

public class SavingsAccount extends BankAccount{
    
    
    private int interestRate;
    
    /**
     * 
     * constructor
     * @param id
     * @param balance
     * @param interestRate
     */
    SavingsAccount(String id, long balance, int interestRate) {
        
        super(id, balance);
        this.interestRate = interestRate;
    }
    
    /**
     * 
     *deposit ur Interest after calculating it with ur balance
     */
    public void giveInterest(){
        
        long interest = (long) (getAccountBalance() * interestRate/1000);
        
        deposit(interest);
    }
    
    /**
     * gets ur interestRate
     * @return interestRate
     */
    public int getInterestRate() {
        
        return interestRate;
    }
    
    /**
     * gives ur all the Information needed (id, balance) of Saving Account
     * @return String
     */
    @Override
    public String toString() {
        return String.format("SavingsAccount id='%s', balance='%d'", getAccountId(), getAccountBalance());
    }
}
