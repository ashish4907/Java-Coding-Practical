class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Employee{
    String name,company;
    int sal;
    Employee(String name, String company, int sal){
        this.name = name;
        this.company = company;
        this.sal = sal;
    }
}

class test1{
    public static void main(String[] args){
        Student s1 = new Student("Ashish",25);
        Student s2 = new Student("Shraddha",24);
        Student s3 = new Student("Shivani",25);

        Employee e1 = new Employee("Ashish","IBM",23000);
        Employee e2 = new Employee("Shraddha","TCS",25000);
        Employee e3 = new Employee("Shivani","Swiggy",35000);

        Object[] x = {s1,s2,s3,e1,e2,e3};
        for(int i=0;i<x.length;i++){
          if(x[i] instanceof Employee ){
            Employee e =(Employee)x[i];
            System.out.println(e.name+" works at "+e.company+" and earns "+e.sal);
          }
          else if(x[i] instanceof Student){
            Student s =(Student)x[i];
            System.out.println(s.name+" is "+s.age+" years old");
          }
        }

    }
}