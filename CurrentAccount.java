package bankAccount;

/**
 * 
 * @Author Artin, Sumru
 * @Version 10.06.2024
 */

public class CurrentAccount extends BankAccount{
    
    
    private int standardFee;
    
    /**
     * 
     * constructor
     * @param id
     * @param standardFee
     */
    CurrentAccount(String id, int standardFee){
        
        super(id);
        this.standardFee = standardFee;
        
    }
    
    /**
     * 
     * constructor
     * @param id
     * @param startingBalance
     * @param standardFee
     */
    CurrentAccount(String id,  long startingBalance, int standardFee){
        
        super(id, startingBalance);
        this.standardFee = standardFee;
        
    }
    
    /**
     * 
     * withdraw money fromn your balance with subtraction of the standard fee
     * @param amount
     */
    @Override
    public void withdraw(long amount) {
            
        assert amount >= 0: "cant withdraw negativ balance";
        
        long fullAmount = amount + standardFee;
        if (getAccountBalance() >= fullAmount) {
            super.withdraw(fullAmount);
        }
        
    }
    
    /**
     * 
     * gets fee
     * @return standard fee
     */
    public int getFee() {
        
        return standardFee;
    }
    
    /**
     * gives all important information (id and balance) of Current Account
     * @return String
     */
    @Override
    public String toString() {
        
        return String.format("CurrentAccount id='%s', balance='%d'", getAccountId(), getAccountBalance());
    }

}
