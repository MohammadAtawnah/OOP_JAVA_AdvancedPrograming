public class Student {
    // Attributes
    String Name;
    int Age;
    private double Balance;
    private boolean Honer;
    String Email;
    String Phone_number;
    private double AVG;
    // constructor 
    Student(int age,String name, String email,String Phone_num)
    {
      this.Age=age; 
      this.Name=name;
      this.Email=email;
      this.Phone_number=Phone_num;
      Balance=0;
      Honer=fales;
    }
    //Encapsulation
    public double deposit(double amount)
    {   
        if (amount>=0)
           Balance+=amount;
        if (amount<0)   
        Balance-=aamount;
        return amount 
    }
}
