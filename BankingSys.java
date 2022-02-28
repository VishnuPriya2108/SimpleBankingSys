package SimpleBankingSystem;
import java.util.Scanner;
public class BankingSys {
	private String accountno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
   
    
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accountno = sc.next();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
   
    
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accountno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    
    public void deposit() {  
        long amt; 
        long bal=0, b=balance;
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        bal = b + amt;
        System.out.println("Your balance is :" + bal)	; 
        }  
  
    
    public void withdrawal() {  
        long amt; 
        long bal1=0, b1=balance;
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (b1 >= amt) {  
            bal1 = b1 - amt;  
            System.out.println("Balance after withdrawal: " + bal1);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    } 
    
    
    
    public boolean search(String ac_no) {  
        if (accountno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}
