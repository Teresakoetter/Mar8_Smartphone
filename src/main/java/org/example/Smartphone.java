package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS{
    static String position = "Köln";
    String modelName;
    String producerName;
    List<Contact> contacts;

    @Override
    public String getPosition() {
        return position;
    }


    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;

    }

    @Override
    public boolean stopRadio() {

        System.out.println("Radio stopped");
        return false;
    }

    public Smartphone() {
    }


    public Smartphone(String modelName, String producerName, List<Contact> contacts) {
        this.modelName = modelName;
        this.producerName = producerName;
        this.contacts = contacts;
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

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
