public class Fun
{
    public void main(String[] args) {
        Employee emp1=new Employee("Rob Stone",1996,"41 B/C");
        Employee emp2=new Employee("Lisa Halls",2001,"23 Hudson Street");
        Employee emp3=new Employee("Jenna Reets",2000,"234C");

        emp1.printdata();
        emp2.printdata();
        emp3.printdata();
    }

    public class Employee{
        public String name;
        public int year;
        public String address;

        public Employee(String name, int year, String address) {
            this.name = name;
            this.year=year;
            this.address = address;
        }

        public void printdata(){
            System.out.println("Name: "+name+" year or joining: "+year+" address: "+address);
        }
    }
}
