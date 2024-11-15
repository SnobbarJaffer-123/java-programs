class A{
private int privVar=2;
private void privMethod(){
System.out.println("a private method access within the class only");
}

protected int procVar=3;
protected void procMethod(){
System.out.println("a protected method access within all classes of the same package and the other packades which inherits its clsss in baseClass");
}

int defVar=10;
void defMethod(){
System.out.println("a default method access within all the classes of the same pakage in base class");
}

public int pubVar=20;
public void publMethod(){
System.out.println("a public method access within all the packags in A class");
}

};
class B extends A{
protected int procVar=4;
protected void procMethod(){
System.out.println("a protected method access within all classes of the same package and the other packades which inherits its clsss in extented class");
super.procMethod();
}

void defMethod(){
System.out.println("a default method access within all the classes of the same pakage in parent class");
super.defMethod();
}

public void publMethod(){
System.out.println("a public method access within all the packags in B class");
super.publMethod();
}
public void demo()
{
this.publMethod();
super.publMethod();
}
};




public class Inheritance{
public static void main(String []args){
B b =new B();
A a=new B();
System.out.println("inherited protected member :"+b.procVar);

b.procMethod();
b.defMethod();

b.demo();
a.publMethod();
}
}