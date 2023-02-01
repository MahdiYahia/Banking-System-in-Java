/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 *
 * @author mahdi
 */
public class User implements java.io.Serializable{
    
   public String username;
   public String password;
   public String firstName;
   public String lastName;
   public String currency;
}

