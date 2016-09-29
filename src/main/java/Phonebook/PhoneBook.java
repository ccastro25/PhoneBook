package Phonebook;

import java.util.*;

/**
 * Created by castro on 9/28/16.
 */
public class PhoneBook {


    private TreeMap<String, ArrayList<Integer> > theContacts = new TreeMap<String, ArrayList<Integer>>();

   private ArrayList<String> deletedContact = new ArrayList<String>() ;






    public void addContact(String name, int number) {
        if(theContacts.containsKey(name)){
            theContacts.get(name).add(number);
        }
        else {

            ArrayList newContact = new ArrayList();
            newContact.add(number);
        theContacts.put(name,newContact);}}


    public String lookUpByName(String name) {

        String numbers="";

      if (theContacts.containsKey(name)){

            for (int i = 0; i< theContacts.get(name).size(); i++) {
             numbers += " # "+  theContacts.get(name).get(i);
            }}

        return numbers;}



    public String lookupbyNumber(int number) {
        for (String go : theContacts.keySet()){
            if( theContacts.get(go).contains(number)){return go;}

        }


        return  null;}




    public void removeContact(String name) {

            String addToDelete =name+ theContacts.get(name);
       deletedContact.add(addToDelete);
        theContacts.remove(name);
    }


    public String listNames() {

        String names="" ;

        for (String go: theContacts.keySet())

            names += " "+go;

        return  names;
    }


    public TreeMap<String,ArrayList<Integer>> listNamesAndNumbers() {
    return theContacts;
    }

    public ArrayList<String>deleteHistory(){


    return deletedContact;
    }


}
