package com.abstractFactory;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        IFactory factory = new SqlserverFactory();
        IUser iUser = factory.createUser();
        iUser.getUser(1);
        iUser.insert(user);
    }
}
