
class Student implements AutoCloseable{
private int age;
private int Enrollment_No;
private static int Object_Counter;
public Student(int age){
this.age = validate_age(age);
this.Enrollment_No = ++Object_Counter;
}
private int validate_age(int age){
if(age < 4 || age > 40){
throw new IllegalArgumentException("Age must be between 4 and 40");
}
return age;
}
public void setAge(int age){
this.age = validate_age(age);
}
public void getStudent(){
System.out.println("Enrollment No: "+Enrollment_No+" has Age: "+age);
}
public static int getCounter(){
return Object_Counter;
}
@Override
//finalize() is depreciated in Java 8 and above
    // protected void finalize() throws Throwable {
    //     Object_Counter--;
    //     super.finalize();
    // }
    //used close() method of AutoClosable Interface...
    public void close() throws Exception{
    Object_Counter--;
    }
}
public class Students{
public static void main(String[] args) {
System.out.println("Object counter: "+Student.getCounter());
try(Student s1 = new Student(25);Student s2 = new Student(18);){
s1.getStudent();
System.out.println("Now Object counter: "+Student.getCounter());
s2.getStudent();
s1.setAge(30);
s1.getStudent();
}
catch(Exception e){
e.printStackTrace();
}
System.out.println("Now Object counter: "+Student.getCounter());
}
}