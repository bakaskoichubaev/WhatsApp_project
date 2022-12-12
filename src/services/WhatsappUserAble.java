package services;

import java8.classes.Person;
import java8.classes.WhatsappUser;

import java.util.List;

public interface WhatsappUserAble {
    String createWhatsappAccount(WhatsappUser whatsappUsers, List<Person>people);
    List<WhatsappUser>getWhatsappUser();
    WhatsappUser getProfile(String password,List<WhatsappUser>whatsappUsers);
    String getMassage(String password, String name, String massege, List<WhatsappUser> users, List<WhatsappUser>users2);
}
