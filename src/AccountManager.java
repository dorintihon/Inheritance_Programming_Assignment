import java.util.ArrayList;

public class AccountManager {
    private ArrayList<Account> accounts;

    public AccountManager() {
        this.accounts = new ArrayList<>();
    }

    /**
     * @return the accounts
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void printDetails() {
        for(Account account:accounts) {
            System.out.println(account);
        }
    }

    public void printAccountDetailsByName(String name) {
        System.out.println();
        System.out.println("Account "+name+" Details");
        for(Account account:accounts) {
            if(name.equals(account.getName())) {
                System.out.println(account);
            }
        }
    }

}