package com.example.postemployee;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement(name = "organization")
public class Organization extends Object {
    int ID;
    String title;
    String address;
    LocalDate creationDate;


    public Organization(int id, String title, String address, LocalDate creationDate) {
        super();
        this.ID = id;
        this.title = title;
        this.address = address;
        this.creationDate = creationDate;
    }

    public Organization(String title, String address, LocalDate creationDate) {
        super();
        this.title = title;
        this.address = address;
        this.creationDate = creationDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }


    @Override
    public String toString() {
        return "Organization{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
