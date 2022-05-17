public class Main {

       public static void main(String[] args) {        
        //test code

        Account jamesAccount = new Account("12345", 0.00, "James White","white@james.com", "012 3456 789);
                                           
        System.out.println(jamesAccount.getNumber());
        System.out.println(jamesAccount.getBalance());
        jamesAccount.withdrawal(200);
        jamesAccount.deposit(100.0);
        jamesAccount.withdrawal(50.0);
        jamesAccount.deposit(71.0);
        jamesAccount.withdrawal(100);
                                           
        Account tiffanysAccount = new Account("Tiffany", "tif@tiffany.com", "12345");
        System.out.println(tiffanyAccount.getNumber()+ "  name :" + tiffanyAccount.getCustomerName());
    }                                       
    }
