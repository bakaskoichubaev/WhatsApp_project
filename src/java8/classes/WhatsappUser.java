package java8.classes;

import java8.enums.WhatsappStatus;

import java.util.ArrayList;
import java.util.List;

public class WhatsappUser {
    private int id;
    private String phoneNumber;
    private String userName;
    private WhatsappStatus whatsappStatus;
    private String password;
    private ArrayList<String> message ;
    private List<Person> people;

    public WhatsappUser(int id, String phoneNumber, String userName, WhatsappStatus whatsappStatus, String password,List<Person>people) {
        for (Person person : people) {
            if(person.getId()== id){
                this.id = id;
                this.phoneNumber = phoneNumber;
                this.userName = userName;
                this.whatsappStatus = whatsappStatus;
                this.password = password;
            }else {

            }
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUzerName() {
        return userName;
    }

    public void setUzerName(String uzerName) {
        this.userName = uzerName;
    }

    public WhatsappStatus getWhatsappStatus() {
        return whatsappStatus;
    }

    public void setWhatsappStatus(WhatsappStatus whatsappStatus) {
        this.whatsappStatus = whatsappStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getMassege() {
        return message;
    }

    public void setMassege(ArrayList<String> massege) {
        this.message = massege;
    }

    @Override
    public String toString() {
        return "\n<<<<<<< WHATSAPP ACCOUNT >>>>>>>>"+
                "\nID : "+id+
                "\nPHONE NUMBER : "+phoneNumber+
                "\nUZER NAME : "+userName+
                "\nWHATSAPP STATUS : "+whatsappStatus+
                "\nPASWORD : "+password+
                "\nMASSEGE : "+message;
    }

}
