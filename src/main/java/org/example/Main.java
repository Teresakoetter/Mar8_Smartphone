package org.example;

import java.util.ArrayList;
import java.util.List;
import org.example.Contact;
import org.example.Friend;

public class Main {
    public static void main(String[] args) {


    Contact babo = new Friend("123", "Babo");
    Contact mowgli = new Friend("456", "Mowgli");
    List<Contact> contactList2 = new ArrayList<>();
    contactList2.add(babo);
    contactList2.add(mowgli);
    Smartphone smarty = new Smartphone("XY3000", "Huawai", contactList2);
        System.out.println(smarty);

}

    //contactList2.add(babo);


}