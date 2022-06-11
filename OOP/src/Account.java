public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private  String  customerPhoneNumber;

    public Account(){
        // calling parametrized constructor
        this("00000" , "Default Name" , 0.0 , "default address" , "default phonenumber");
        System.out.println("Empty constructor called");
    }

    public  Account(String number ,String customerName, double balance , String customerEmail , String customerPhoneNumber ){
        this.number = number;
        this.customerName = customerName;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("9999" , customerName , 0.00 , customerEmail , customerPhoneNumber);

    }

    public void setAccNum(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.customerEmail = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }

    public String getAccNum() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    public void deposit(double balance){

        this.balance += balance;
        System.out.println("Account credited by " + balance);
    }

    public void withDraw(double balance){
        if(this.balance < balance){
            System.out.println("Funds not available");
            return ;
        }
        this.balance -= balance;
        System.out.println("Account debited by " + balance);
    }
}
