import java.util.Random;
import java.util.random.*;
public class Account {
    Random random = new Random();
    private int accountId = random.nextInt(1000000);
    private double balance;

    public int getAccountId(){
        return accountId;
    }
}
