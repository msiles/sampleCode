package model;

import com.google.common.base.MoreObjects;

/**
 * Created by msiles on 4/11/2015.
 */
public final class AdminLogin extends Entity {
    public String username;
    public String password;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("username", username)
                .add("password", password)
                .toString();
    }
}
