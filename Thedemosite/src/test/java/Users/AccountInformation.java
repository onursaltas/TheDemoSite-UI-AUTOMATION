package Users;
/**
 * Created by onur on 20/04/21.
 */
public class AccountInformation {

    private String email;
    private String password;


    public AccountInformation(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
