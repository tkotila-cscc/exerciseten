package cscc.tkotila;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ContactInfoCollection contacts = new ContactInfoCollection();
        ContactInfo killoran = new ContactInfo("Mr.Killoran", "mkillor@cscc.edu");

        contacts.addContact("Tyler Kotila", "tkotila@student.cscc.edu");
        contacts.addContact(killoran);

        for (ContactInfo contact: contacts) {
            System.out.println(contact);
        }
    }
}


class ContactInfo {
    private String name;
    private String email;

    public ContactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Email: " + email;
    }
}

class ContactInfoCollection implements Iterable<ContactInfo> {
    private ArrayList<ContactInfo> contacts;

    public ContactInfoCollection() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(ContactInfo contactInfo) {
        contacts.add(contactInfo);
    }

    public void addContact(String name, String email) {
        contacts.add(new ContactInfo(name, email));
    }

    @Override
    public Iterator<ContactInfo> iterator() {
        return this.contacts.iterator();
    }
}