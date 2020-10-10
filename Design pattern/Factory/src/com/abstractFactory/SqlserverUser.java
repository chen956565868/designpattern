package com.abstractFactory;

public class SqlserverUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("SqlserverUser insert");
    }

    @Override
    public User getUser(int id) {
        System.out.println("SqlserverUser getUser");
        return null;
    }
}
