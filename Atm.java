import java.util.*;
class OOPs{
    float balance=80000;
    int PIN=9999;

    public  void checkpin(){
        System.err.println("Enter Your Pin");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }else {
            System.out.println("Invalid Pin ! Please Try Again");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Exit");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBanlance();
        }else if(opt==2){
            WithdrawMoney();
        }else if(opt==3){
            depositeCash();
        }else if(opt==4){
            return;
        }else{
            System.out.println("Invalid Choice");
        }
    }
    public void checkBanlance(){
      System.out.println("Your total balance is Rs "+ balance);
      menu();
    }
    public void WithdrawMoney(){
      System.out.println("Enter Amount to withdraw");
      Scanner sc=new Scanner(System.in);
      float amount=sc.nextFloat();
      if(amount>balance){
        System.out.println("Insufficient Balance");
      }else {
          balance=balance-amount;
          System.out.println("Withdrawal Successful");
      }
      menu();
    }
    public void depositeCash(){
       System.out.println("Enter how much to deposit");
       Scanner sc=new Scanner(System.in);
       float amount=sc.nextFloat();
       balance=balance+amount;
       System.out.println("Deposit Successful");
       menu();
    }
}
// class oops{
//     String name;
// }
public class Atm {
    public static void main(String[] args) {
        OOPs atm=new OOPs();
        atm.checkpin();
    
    }
}
