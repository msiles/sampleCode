package utility;

import model.AdminLogin;
import model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by msiles on 4/11/15.
 */
public class Users {
    private static Random random = new Random();
    private static List<User> logins = new ArrayList<>();
    private static User admin;
    static {
        User login = new User();
        login.username = "autoOrexigen";
        login.password = "webdriver123@";
        logins.add(login);

        login = new User();
        login.username = "autoSanten";
        login.password = "webdriver123@";
        logins.add(login);

        login = new User();
        login.username = "autoInventiv";
        login.password = "webdriver123@";
        logins.add(login);

        //This is an admin user
        admin = new User();
        admin.username = "qaautomation";
        admin.password = "webdriver123@";
    }

    public static User random() {
        return logins.get(random.nextInt(logins.size())).clone();
    }

    public static User get(int index) {
        return logins.get(index).clone();
    }

    public static AdminLogin admin() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.username = admin.username;
        adminLogin.password = admin.password;
        return adminLogin;
    }
}
