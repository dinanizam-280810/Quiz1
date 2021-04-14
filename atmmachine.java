
package main;

import java.util.Scanner;
public class atmmachine {
    Scanner input=new Scanner(System.in);
        String name;
    int withdraw;
    double deposit,check;
    
    
    //create setter method
    public void accountname(String name){
            System.out.println("Enter your name: ");
     System.out.println("Enter name: ");
     
        this.name=input.next();
    }
    public void makewithdraw(int withdraw){
        System.out.println("Please enter amount to withdraw: ");
              
        this.withdraw=input.nextInt();
    }
    public void makedeposit(double deposit){
         
                System.out.println("Please enter amount you would wish to deposit: ");
                deposit = input .nextDouble();
              
       this.deposit=input.nextDouble();
        
    }
    public void checkingaccount(double check){
        System.out.print("Do you want to check balance: ");
        this.check=input.nextDouble;
    }
    
    //create getter method
    public String accountname(){
      
        return this.name;
    }
    public Integer makewithdraw(){
        return this.withdraw;
       
    }
    public double makedeposit(){
        return this.deposit;
    }
    public double checkingaccount(){
        return this.check;
    }
    //create a fullthrottle() method
    public void saythankyou(){
        System.out.println("\nThank You And Enjoy your money");
    }
}
