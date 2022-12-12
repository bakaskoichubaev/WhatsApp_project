import java8.classes.Person;
import java8.classes.WhatsappUser;
import java8.enums.Country;
import java8.enums.Gender;
import java8.enums.WhatsappStatus;
import services.impl.PersonServiceImpl;
import services.impl.WhatsappUserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peoples = new ArrayList<>();
        List<WhatsappUser>whatsappUsers = new ArrayList<>();
        PersonServiceImpl personServices = new PersonServiceImpl();
        WhatsappUserServiceImpl whatsappUserServices = new WhatsappUserServiceImpl();
        while (true){

            System.out.println("PRESS 1 CREATE PASSPORT!");
            System.out.println("PRESS 2 GET ALL PASPORT!");
            System.out.println("PRESS 3 CREATE WHATSAPP ACCOUNT!");
            System.out.println("PRESS 4 GET ALL WHATSAPP ACCOUNT!");
            System.out.println("PRESS 5 GET WHATSAPP PROFIL!");
            System.out.println("PRESS 6 GET PERSON FIRST NAME!");
            System.out.println("PRESS 7 GET MASSAGE!");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    String n1 = scanner.nextLine();
                    System.out.print("FIRST NAME : ");
                    String firstName = scanner.nextLine();
                    System.out.print("LAST NAME : ");
                    String lastName = scanner.nextLine();
                    System.out.print("DATE OF BIRTH-(XXXX-XX-XX) : ");
                    String dateOfBirt = scanner.nextLine();
                    System.out.println(personServices.create(new Person(id,firstName,lastName,dateOfBirt, Country.BISHKEK, Gender.MALE)));
                    break;
                case 2:
                    System.out.println(personServices.getPerson());
                    break;
                case 3:
                    System.out.print("ID : ");
                    int id2 = scanner.nextInt();
                    String n11 = scanner.nextLine();
                    System.out.print("USER NAME : ");
                    String whatsappName = scanner.nextLine();
                    System.out.print("PHONE NUMBER :1 ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("PASWORD : ");
                    String password = scanner.nextLine();
                    System.out.println(whatsappUserServices.createWhatsappAccount(new WhatsappUser(id2,
                            phoneNumber, whatsappName, WhatsappStatus.WWWW,password,personServices.getPerson()),peoples));
                    break;
                case 4:
                    System.out.println(whatsappUserServices.getWhatsappUser());
                    break;
                case 5:
                    String nnn = scanner.nextLine();
                    System.out.print("PASSWORD : ");
                    String password2 = scanner.nextLine();
                    System.out.println(whatsappUserServices.getProfile(password2, whatsappUserServices.getWhatsappUser()));
                    break;
                case 6:
                    String nm = scanner.nextLine();
                    System.out.print("FIRST NAME : ");
                    String firstName2 = scanner.nextLine();
                    System.out.println(personServices.getPersonFirsName(firstName2, personServices.getPerson()));
                    break;
                case 7:
                    String nn5 = scanner.nextLine();
                    System.out.print("PASSWORD : ");
                    String password4 = scanner.nextLine();
                    System.out.print("USER NAME : ");
                    String uz = scanner.nextLine();
                    System.out.print("MESSAGE : ");
                    String message = scanner.nextLine();
                    System.out.println(whatsappUserServices.getMassage(password4, uz, message, whatsappUserServices.getWhatsappUser(),whatsappUserServices.getWhatsappUser()));
                    break;
                case 8:
                    String nom  = scanner.nextLine();
                    System.out.println("passport ID : ");
                    String passport  = scanner.nextLine();
                    System.out.println("phoneNumber:  ");
                    String phone_number = scanner.nextLine();
                    System.out.println("password: ");
                    String passw = scanner.nextLine();
                    System.out.println("userName:   ");
                    String name = scanner.nextLine();
                    System.out.println(whatsappUserServices.getMassage(passport, phone_number, passw, name, whatsappUserServices.getWhatsappUser(),whatsappUserServices.getWhatsappUser()));



            }

        }



    }
}

