package PhoneBookTest;

import Phonebook.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.PanelUI;
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
@Test
public void removeTest(){

    phoneBook.addContact("phil",4545);
    phoneBook.addContact("james",215343);
    phoneBook.addContact("castro",216565);
    phoneBook.removeContact("phil");

    String expectedNames = " castro james";
    Assert.assertEquals("print deleted history",expectedNames,phoneBook.listNames());

}


@Test
public void historyTest(){

    phoneBook.addContact("phil",4545);
    phoneBook.addContact("james",215343);
    phoneBook.addContact("castro",216565);

    phoneBook.removeContact("phil");
    phoneBook.removeContact("castro");

    Assert.assertEquals("test",phoneBook.deleteHistory());
}
}
