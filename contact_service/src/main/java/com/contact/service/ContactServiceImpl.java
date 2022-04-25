package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> contactList=List.of(
            new Contact(1L,"mrugendra@gmail.com","Mrugendra Rahevar",7777L),
            new Contact(2L,"martin@gmail.com","Martin Parmar",8888L),
            new Contact(3L,"nikunj@gmail.com","Nikunj Patel",9999L)
    );

    @Override
    public List<Contact> getContactOfUser(Long userid) {
        return contactList.stream().filter(contact -> contact.getUserId().equals(userid)).collect(Collectors.toList());
    }
}
