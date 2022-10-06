import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
// create the AccountManager Object
        AccountManager accountManager = new AccountManager();

        ArrayList<Account> accounts = new ArrayList<>();

// create 6 objects of different kinds
        IndividualAccount account1 = new IndividualAccount("Neena", "2021/01/01", "nn@hhh.nnn", null, "Permanent","B.Tech");
        IndividualAccount account2 = new IndividualAccount("Jackey", "2021/02/01", "jn@hhh.nnn", null, "Permanent", "M.Tech");
        CommunityAccount account3 = new CommunityAccount("Shalu", "2020/10/09", "shalu@ff.jj", null, "ghsdg.dd", "Wedding");
        CommunityAccount account4 = new CommunityAccount("Achu", "2020/10/09", "achu@ff.jj", null, "ghsdg.dd", "Wedding");
        BusinessAccount account5 = new BusinessAccount("Sona", "2020/11/11", "sona@hhh.iii", null, "son@ggg.kk", 5);
        BusinessAccount account6 = new BusinessAccount("Kitty", "2020/11/11", "skia@hhh.iii", null, "kn@ggg.kk", 5);
//Add all accounts to list
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
        accounts.add(account6);
//Call set method
        accountManager.setAccounts(accounts);
//Call print details
        accountManager.printDetails();
//Call printAccountDetailsByName
        accountManager.printAccountDetailsByName("Achu");

    }

}
