package model;

import com.google.common.base.MoreObjects;

/**
 * Created by msiles on 18/05/2015.
 */
public final class User extends Entity implements Cloneable{
    public String company;
    public String role;
    public String firstName;
    public String lastName;
    public String timeZone;
    public String username;
    public String password;
    public String confirmPassword;

    @Override
    public User clone() {
        User clone = new User();
        clone.company = company;
        clone.role = role;
        clone.firstName = firstName;
        clone.lastName = lastName;
        clone.timeZone = timeZone;
        clone.username = username;
        clone.password = password;
        clone.confirmPassword = confirmPassword;
        return clone;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("company", company)
                .add("role", role)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("timeZone", timeZone)
                .add("username", username)
                .add("password", password)
                .add("confirmPassword", confirmPassword)
                .toString();
    }
}
