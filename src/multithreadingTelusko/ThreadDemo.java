package multithreadingTelusko;


class Hi extends Thread{
	
	//public void show() 
	public void run()
	{
		for(int i=1; i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread{
	//public void show()
	public void run()
	
	{
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
}

public class ThreadDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hi obj1= new Hi();
		Hello obj2 = new Hello();
		
		obj1.start(); // when ever we say start , internally thread will execute run method
		obj2.start();
		
//		obj1.show();
//		obj2.show();
//		

	}

}
