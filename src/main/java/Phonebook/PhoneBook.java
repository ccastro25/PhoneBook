package Phonebook;

import java.util.*;

/**
 * Created by castro on 9/28/16.
 */
public class PhoneBook {


    private TreeMap<String, ArrayList<Integer> > theTable = new TreeMap<String, ArrayList<Integer>>();

   private ArrayList<Integer> phoneNumber = new ArrayList<Integer>();






    public void addContact(String name, int number) {
        if(theTable.containsKey(name)){
            theTable.get(name).add(number);
        }
        else {

            ArrayList newContact = new ArrayList();
            newContact.add(number);
        theTable.put(name,newContact);}}


    public String lookUpByName(String name) {

        String numbers="";

      if (theTable.containsKey(name)){

            for (int i =0;i<theTable.get(name).size();i++) {
             numbers += " # "+  theTable.get(name).get(i);
            }}

        return numbers;}



    public String lookupbyNumber(int number) {
        for (String go :theTable.keySet()){
            if( theTable.get(go).contains(number)){return go;}

        }


        return  null;}




    public void removeContact(String name) {
        theTable.remove(name);
    }


    public String listNames() {

        String names="" ;

        for (String go: theTable.keySet())

            names += " "+go;

        return  names;
    }


    public TreeMap<String,ArrayList<Integer>> listNamesAndNumbers() {
    return  theTable;
    }
}
