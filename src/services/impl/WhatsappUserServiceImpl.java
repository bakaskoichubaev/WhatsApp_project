package services.impl;

import java8.classes.Person;
import java8.classes.WhatsappUser;
import services.WhatsappUserAble;

import java.util.ArrayList;
import java.util.List;

public class WhatsappUserServiceImpl implements WhatsappUserAble {
    List<WhatsappUser>whatsappUsers = new ArrayList<>();
@Override
    public String createWhatsappAccount(WhatsappUser whatsappUser, List<Person>people) {
        if (whatsappUser.getId()!=0){
            this.whatsappUsers.add(whatsappUser);
            return "УСПЕШНО!!!";
        }else {
            return "АКАУНТ НЕ СОЗДАН!!!";
        }


    }

    @Override
    public List<WhatsappUser> getWhatsappUser() {
        return this.whatsappUsers;
    }

    @Override
    public WhatsappUser getProfile(String password,List<WhatsappUser> whatsappUsers) {
        for (WhatsappUser whatsappUser : whatsappUsers) {
            if(whatsappUser.getPassword().equals(password)){
                return whatsappUser;
            }
        }
        return null;
    }

    @Override
    public String getMassage(String password,String name,String message, List<WhatsappUser> users,List<WhatsappUser>users2) {
        for (WhatsappUser user : users) {
            for (WhatsappUser whatsappUser : users2) {
                if(user.getPassword().equals(password)) {
                    if (whatsappUser.getUzerName().equals(name)) {
                        ArrayList<String> mas = new ArrayList<>();
                        mas.add(message);
                        whatsappUser.setMassege(mas);
                        return "СОБШЕННИЕ ОТПРАВЛЕННО!!";
                    }
                }
            }
        }
        return null;
    }
}

