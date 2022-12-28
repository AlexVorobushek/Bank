package org.example;

public class Client {
    final String firstName;
    final String secondName;
    private String passwd;
    public Client(String firstName, String secondName, String passwd){
        this.firstName = firstName;
        this.secondName = secondName;
        this.passwd = passwd;
    }

    public boolean isTruePasswd(String passwd){
        return passwd == this.passwd;
    }
}