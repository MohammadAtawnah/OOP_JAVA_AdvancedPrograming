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
    public boolean check_Honer()
    {
        if(AVG>+=85.00)
          return true;
        else 
        return fales;  
    }

    public double Calculate_AVG(double []Marks)
    {
        double total=0;
        double AVG=0;
        for(double mark :Marks)
        {
            total+=mark;
        }
        AVG=total/Marks.length;
        return AVG;
    }
    private void Set_AVG(double []Marks)
    {
        this.AVG=Calculate_AVG(Marks);
    }
    public void show_AVG()
    {
        System.out.print("Your avrage is " + this.AVG);
    }
}
