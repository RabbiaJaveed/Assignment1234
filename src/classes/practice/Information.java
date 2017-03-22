/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.practice;

/**
 *
 * @author Fiaz
 */
import java.util.Scanner;
public class Information {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String name,college;
        int age;
        System.out.println("Enter name");
        name=scan.nextLine();
          System.out.println("Enter age");
        age=scan.nextInt();
          System.out.println("Enter college name");
        college=scan.nextLine();
         
          System.out.println("the name is"+name);
          System.out.println("the age is"+age);
            System.out.println("the college name is"+college);
          
       
        
    }
}
