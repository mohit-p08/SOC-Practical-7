package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactOfUser(Long userid);
}