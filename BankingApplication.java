import java.util.Scanner;

public class BankingApplication {
    public static void main(String arr[]){ 
       
        Scanner sc = new Scanner(System.in);
        BankAccount bank = new BankAccount("xyz", "01");
        bank.showMenu();
        


    }
}



class BankAccount{
    int balance;
    int PreviousTransaction;
    String customerName;
    String customerID;

    BankAccount(String cName, String cID){
        customerName=cName;

        customerID=cID;

    }

    void deposite(int amount){
        if (amount !=0){
            balance=balance+amount;
            PreviousTransaction = amount;
        }
    }
    void withdraw(int amount){
        balance=balance-amount;
        PreviousTransaction=-amount;

    }
    void getPreviousTransaction(){

        if(PreviousTransaction>0){
            System.out.println("Deposited:"+PreviousTransaction);
        }
        else if(PreviousTransaction<0){
            System.out.println("withdraw:"+Math.abs(PreviousTransaction));

        }
        else{
            System.out.println("transaction not occurs");
        }
    }
   void showMenu(){
    char option= '\0';
    Scanner sc= new Scanner(System.in);
    System.out.println("Welcome :"+customerName);
    System.out.println("Your ID:"+customerID);
    System.out.println();
    System.out.println("A: Check your bank balance");
    System.out.println("B: Deposite to bank");
    System.out.println("C: Withdraw from Bank");
    System.out.println("D: Get the previeus transaction");
    System.out.println("E: Exit");

    do{

        System.out.println("================================");
        System.out.println("Enter The option");
        System.out.println("================================");
        option= sc.next().charAt(0);
      //  Character.toUpperCase(option);

        switch(option){

            case 'A':
            System.out.println("============================");
            System.out.println("Balance is:"+balance);
            System.out.println("============================");
            System.out.println();
            break;

            case 'B':
            System.out.println("============================");
            System.out.println("Enter the amount to Deposite:");
            System.out.println("============================");
            int amount=sc.nextInt();
            deposite(amount);
            System.out.println();
            break;

            case 'C':
            System.out.println("============================");
            System.out.println("Enter the amount to Withdraw:");
            System.out.println("============================");
            int amount2=sc.nextInt();
             withdraw(amount2);
            System.out.println();
            break;

            case 'D':
            System.out.println("============================");
            getPreviousTransaction();
            System.out.println("============================");
            System.out.println();
            break;

            case 'E':
            System.out.println("============================");
            break;

            default:
            System.out.println("Please enter valid value");

        }
       

    }
     while(option!='E');

   }
}