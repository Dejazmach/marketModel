package org.dejach;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminPrimaryKey implements Serializable {
    protected String userName;
    protected String password;

    public AdminPrimaryKey() {}

    public AdminPrimaryKey(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
