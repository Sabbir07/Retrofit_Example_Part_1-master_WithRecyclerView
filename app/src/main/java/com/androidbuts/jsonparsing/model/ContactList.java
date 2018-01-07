package com.androidbuts.jsonparsing.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
/*
    @SerializedName("contacts")
    @Expose
    private ArrayList<Contact> contacts = new ArrayList<>();

    *//**
     * @return The contacts
     *//*
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    *//**
     * @param contacts The contacts
     *//*
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }*/


    @SerializedName("slot")
    @Expose
    private List<Contact> contacts = null;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}
