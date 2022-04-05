package student;

public class B extends A {
	int d=20;
	int e=100;
	int subtraction(int f) 
	{
	f=e-d; 
    System.out.println("subtarction is:"+ f);
	return f;
	}
	int a=20;
	int b=100;
	
public static void main(String[] args) {
    int p=0;
    B b=new B();
    b.subtraction(p);
    b.add(p);
	}

}
