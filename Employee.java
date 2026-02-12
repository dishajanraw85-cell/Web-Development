class Employee
{
    String name;
    String dob;
    int id;
    Employee(String name,String dob,int id)
    {
        this.name=name;
        this.dob=dob;
        this.id=id;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Date of Birth:"+dob);
        System.out.println("ID:"+id);
    }
}
class Manager extends Empolyee
{
    Manager(String name,String dob,int id,double salary)
    {
        super(name,dob,id);
        this.salary=salary;
    }
    void display()
    {
        super.display();
        System.out.println("Salary:"+salary);
    }
}
class SalesManager extends Manager
{
    double commission;
    SalesManager(String name,String dob,int id,double salary,double commission)
    {
        super(name,dob,id,salary);
        this.commission;
    }
    void display()
    {
        super.display();
        System.out.println("Commission:"+commission);
    }
}
public class Company
{
    public static void main(String args[])
    {
        SalesManager sm=new SalesManager("Disha Janraw","15-10-2004",101,50000,10000);
        sm.display();
    }
}