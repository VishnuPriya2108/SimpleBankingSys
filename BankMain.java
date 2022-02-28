package SimpleBankingSystem;
import java.util.Scanner;
public class BankMain {

	public static void main(String[] args) {
		
		  
		        Scanner sc = new Scanner(System.in);  
		        
		        
		        System.out.print("Enter the no.of customer who want to take account: ");  
		        int n = sc.nextInt();  
		        BankingSys C[] = new BankingSys[n];  
		        for (int i = 0; i < C.length; i++) {  
		            C[i] = new BankingSys();  
		            C[i].openAccount();  
		        }  
		        
		        
		        int ch;  
		        do {  
		            System.out.println("\n *** Welcome to our Banking System Application***");  
		            System.out.println("Main menu:");
		            
		     
		            System.out.println("1. Display all account details \n  2. Deposit the amount \n 3. Withdraw the amount \n 4.Exit ");  
		            System.out.println("Enter your choice: ");  
		            ch = sc.nextInt();  
		                switch (ch) {  
		                    case 1:  
		                        for (int i = 0; i < C.length; i++) {  
		                            C[i].showAccount();  
		                        }  
		                        break;  
		                 
		                    case 2:  
		                        System.out.print("Enter Account no. : ");  
		                        String  ac_no = sc.next();  
		                        boolean found = false;  
		                        for (int i = 0; i < C.length; i++) {  
		                            found = C[i].search(ac_no);  
		                            if (found) {  
		                                C[i].deposit();  
		                                break;  
		                            }  
		                        }  
		                        if (!found) {  
		                            System.out.println("Search failed! Account doesn't exist..!!");  
		                        }  
		                        break;  
		                    case 3:  
		                        System.out.print("Enter Account No : ");  
		                        ac_no = sc.next();  
		                        found = false;  
		                        for (int i = 0; i < C.length; i++) {  
		                            found = C[i].search(ac_no);  
		                            if (found) {  
		                                C[i].withdrawal();  
		                                break;  
		                            }  
		                        }  
		                        if (!found) {  
		                            System.out.println("Search failed! Account doesn't exist..!!");  
		                        }  
		                        break;  
		                   case 4:  
		                        System.out.println("Thank you for your transcation");  
		                        break;  
		                }  
		            }  
		            while (ch!=5); 
		        }  
		     
		


	}


