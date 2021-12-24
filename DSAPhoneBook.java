package dsaphonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DSAPhoneBook {

    static LinkedList allContacts = new LinkedList(new ContactsComparator());
    static Contacts c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //phoneNumber and fullName
        DSAPhoneBook.readInputFile(args[0]);
        //AtoZ();
        addData();
        System.out.println(allContacts.ShowTable());
        while (true) {
            System.out.print("Search (press x is Exit) : ");
            String input = sc.nextLine();
            char c = input.charAt(0);
            if (input.length() == 1 && c == 'x') {
                System.out.println("Exit !!");
                System.exit(0);
            } else if (c >= 65 && c <= 90 && input.length() > 1) {
                System.out.println("Searching...");
                System.out.println("Phone Number :  "+allContacts.ShowANS(input));
            } else {
                System.out.println("Please enter full name !");
            }
        }
         
    }
    static void addContacts(String fullName, String phoneNumber){
       
        allContacts.insertInOrder(fullName, phoneNumber);
    }
    static void addData(){
        allContacts.checking();
    }
    

    private static void readInputFile(String fname) {
        
        int sum = 0;
        try {
            Scanner file = new Scanner(new File(fname));
            while (file.hasNextLine()) {
                String s = file.nextLine();
                String[] fields = s.split("\t", -1);
                addContacts(fields[0],fields[1]);

            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }



}
