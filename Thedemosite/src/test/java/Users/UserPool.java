package Users;
/**
 * Created by onur on 20/04/21.
 */
import java.util.Random;

public class UserPool {

    public static AccountInformation getUserFirst() {
        return new AccountInformation("Finartz", "finartz1");
    }
    public static AccountInformation getUserSecond() {
        return new AccountInformation("Failed", "failed1");
    }
    public static AccountInformation getUserThird() {
        return new AccountInformation("fin", "finartz1");
    }
    public static AccountInformation getUserFourth() {
        return new AccountInformation("Finartz", "fin");
    }

}
