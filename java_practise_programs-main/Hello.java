
import java.lang.*;
public class Hello  {

	public static void main(String[] args) {
		Runnable  obj1 = new Thread1();
		Runnable  obj2= new Thread2();
		
		Thread t1 =  new Thread(obj1);
		Thread t2 =  new Thread(obj2);
		t1.start();
		try { Thread.sleep(10);  } catch (Exception e) { }
		t2.start();
	}
	}
class Thread1 implements Runnable {
	public void run() {
		for(int i= 1; i<=5; i++) {
			System.out.println("Hii");
			try { Thread.sleep(1000);
		} catch (Exception e) {}
	}
}
}
class Thread2 implements Runnable{
	
	public void run() {
	 for(int i = 1; i<=5;i++) {
		 System.out.println("Hello");
		 try { Thread.sleep(1000);  } catch (Exception e) { }
	 }
	}
}
