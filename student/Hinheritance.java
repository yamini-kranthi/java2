package student;

public class Hinheritance {

	public static void main(String[] args) {
		Two t = new Two();
		t.show();
		System.out.println("b=" + t.b);
	}
}

class One {
	int a = 50;
	void display() {
		System.out.println("this is the parent class method display");
	}
}
class Two extends One {
	int b = 20;// in child class we can aquire properties with out creating object(directly)
	void show() {
		display();
		System.out.println("a=" + a);
		System.out.println("this is the child class method of A");
	}
}

class C extends One {
	int c = 30;
	void print() {
		System.out.println("this is the child class method of a");
	}
}
