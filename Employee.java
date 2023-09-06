class Employee{
 int id;
 String name;
 double sal;
 Employee(int arg1,String arg2,double arg3){
    id=arg1;
    name=arg2;
    sal=arg3;
 }
 void details(){
    System.out.println(" id :  " +id+ " name : "+name+"  sal : "+sal);

 }
}
class mainclass5{
    public static void main(String[] args) {
        System.out.println("mms");
        Employee e1=new Employee(00,"a",2000);
        Employee e2=new Employee(11,"b",3000);
        e1.details();
        e2.details();
        System.out.println("mme");
    }
}