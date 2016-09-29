package PhoneBookTest;

import Phonebook.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by castro on 9/28/16.
 */
public class TestPhoneBook {

PhoneBook phoneBook = new PhoneBook();
    HashMap<String,ArrayList<Integer>> expected = new HashMap<String, ArrayList<Integer>>();

    ArrayList<Integer> phoneNumber = new ArrayList<Integer>();

    @Test
    public void testAddingContact(){

        String actual =" # 215343 # 216565";
        phoneBook.addContact("castro",215343);
        phoneBook.addContact("castro",216565);




        Assert.assertEquals("print add contact",actual,phoneBook.lookUpByName("castro"));

    }

    @Test
    public void testLookUpByName(){

        phoneBook.addContact("phil",4545);
        phoneBook.addContact("james",215343);
        phoneBook.addContact("castro",216565);

        String expcected = "castro";
       String actual = phoneBook.lookupbyNumber(216565);

        Assert.assertEquals("print add contact number",expcected,actual);
    }


    @Test
    public  void testNames(){
        phoneBook.addContact("phil",4545);
        phoneBook.addContact("james",215343);
        phoneBook.addContact("castro",216565);
        String expected = " castro james phil";
        String actual = phoneBook.listNames();

        Assert.assertEquals("print names",expected,actual);

    }

    @Test
    public void testPrintNamesAndNumbers(){
    phoneBook.addContact("phil",4545);
    phoneBook.addContact("james",215343);
    phoneBook.addContact("castro",216565);



    Assert.assertEquals("Print names and numbers ",
            phoneBook.listNamesAndNumbers());

}

}
