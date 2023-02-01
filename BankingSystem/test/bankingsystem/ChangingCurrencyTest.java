/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mahdi
 */
public class ChangingCurrencyTest {

    
    
    public ChangingCurrencyTest() {
    }
    
   
    @BeforeEach
    public void setUp() throws IOException {
        User testUser = null;
        testUser.username="Mahdi";
        testUser.password="PASSWORD";
        testUser.firstName= "Mahdi";
        testUser.lastName="Yahia";
        testUser.currency="EUR";    
         try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("Mahdidata.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(testUser);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
        }
         catch(IOException ex){
            System.out.println("IOException is caught");
       }
         
          Writer fileWriter = new FileWriter("Mahdihistory.txt");
          PrintWriter printWriter = new PrintWriter(fileWriter);
          printWriter.println("20   Deposit"+"   "+java.time.LocalDate.now().toString());
          printWriter.println("10   Deposit"+"   "+java.time.LocalDate.now().toString());
          printWriter.close();
    }                                                
    
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() throws FileNotFoundException {
        // TODO review the generated test code and remove the default call to fail.
        ChangingCurrency testClass = new ChangingCurrency("Mahdi");
        testClass.getPreviousCurrency();
        assertEquals("Same Currency","EUR",testClass.previousCurrency);
        testClass.updateCurrency( 350 , "HUF");
         File thisUserHistory = new File("Mahdihistory.txt");
           Scanner histroryFile = new Scanner(thisUserHistory);
         
              String data = histroryFile.nextLine();
              String[] arrOfData   =data.split("   ",3);
              
              assertEquals("Successful conversion",arrOfData[0],"7000");
              
             data = histroryFile.nextLine();
             arrOfData   =data.split("   ",3);
              
              assertEquals("Successful conversion",arrOfData[0],"3500");
              
                       
            histroryFile.close();  
    }
    
}
