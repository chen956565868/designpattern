package com.abstractFactory;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("AccessUser insert");
    }

    @Override
    public User getUser(int id) {
        System.out.println("AccessUser getUser");
        return null;
    }
}
