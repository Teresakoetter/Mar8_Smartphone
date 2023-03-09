package org.example;

public class Friend extends Contact{
    String telNumber;

    public Friend() {
    }

    public Friend(String telNumber, String name) {
        super(name);
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telNumber='" + telNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
}
