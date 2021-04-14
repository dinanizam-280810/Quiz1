
package main;


public class Main {

    public static void main(String[] args) {
       machine atm=new machine();
       atm.accountname();
       atm.makewithdraw();
       atm.makedeposit();
       atm.checkingaccount();
       
       System.out.println("Name: "+atm.accountname());
       System.out.println("Your Withdraw Amount:RM "+atm.makewithdraw());
       System.out.println("Your Deposit Amount:RM "+ atm.makedeposit());
       System.out.println("This Is Your Balance:RM "+ atm.checkingaccount());
       atm.fullthrottle();
       
    }
    
}
