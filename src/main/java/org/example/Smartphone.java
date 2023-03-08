package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS{
    static String position = "Köln";
    String modelName;
    String producerName;
    public List<Contact> contactList = new ArrayList<>();

    @Override
    public String getPosition() {
        return position;
    }


    @Override
    public String startRadio() {
        return "Radio started :) ";

    }

    @Override
    public String stopRadio() {

        return "Radio stopped  :/ ";
    }

    public Smartphone() {
    }

    public Smartphone(String modelName, String producerName, List<Contact> contactList) {
        this.modelName = modelName;
        this.producerName = producerName;
        this.contactList = contactList;
    }

    public static void setPosition(String position) {
        Smartphone.position = position;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}
