package Head_First_Java;
import java.util.Scanner;
class ATM{
    float Balance=0; // in Rupees
    int PIN= 5674;
    Scanner sc=new Scanner(System.in);
    void checkPIN(){
        System.out.println("Enter your PIN");
        // Scanner sc=new Scanner(System.in);
        int enteredPIN=sc.nextInt();
        if(enteredPIN==PIN){
            menu();
        }
        else{
           System.out.println("Enter the valid PIN");
           checkPIN();
        }
        sc.close();
    }
    void menu(){
        // Scanner sc=new Scanner(System.in);
        System.out.println("------Menu------");
        System.out.println("1. Check a/c balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("-----------------");
        choice();

    }
    void choice()    {
        System.out.println("Enter your choice");
        // choice
        int choice=sc.nextInt();

        if(choice==1){
            checkBalance();
        }
        else if(choice==2){
            withdrawBalance();
        }
        else if(choice==3){
            depositBalance();
        }
        else if(choice==4){
            return;
        }
        else {
            System.out.println("Enter a valid choice");
        }


        sc.close();
    
    }
        

    
    void checkBalance(){
        System.out.println("Current Balance: "+ Balance);
        System.out.println("***");
        choice();

    }
    void withdrawBalance(){
        // Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount of be withdrawn");
        float withdraw = sc.nextFloat();
        if(withdraw>Balance){
            System.out.println("Insufficient money");
        }
        else{
        Balance=Balance-withdraw;
        }
        System.out.println("Money withdrawn successfully");
        System.out.println("***");
        choice();

        sc.close();

    }
    void depositBalance(){
        
        System.out.println("Enter the Amount to be deposited");
        float deposit=sc.nextFloat();
        
        Balance=Balance+deposit;
        System.out.println("Money deposited successfully");
        System.out.println("***");

        choice();
        sc.close();
    }
}

public class ATMmachine {
    public static void main(String[] args) {
     ATM obj=new ATM();
     obj.checkPIN();
    }
    
}
