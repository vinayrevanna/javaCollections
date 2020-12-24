package io.javaCollect;

class Hi implements Runnable {
		public void run(){
			for(int i=1;i<=5;i++){
				System.out.println("hi");
				try{ Thread.sleep(500);} catch(Exception e){ e.printStackTrace();}
			}
		}
}

class Hello extends Thread{
	public void print(){
		System.out.println("print class");
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("hello");
			try{ Thread.sleep(500);} catch(Exception e){ e.printStackTrace();}
		}
	}
}

public class ArrListCla {

	public static void main(String[] args) {
		
		Hi ob1 = new Hi();
		Hello ob2 = new Hello();
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		t1.start();
		try{ Thread.sleep(10);} catch(Exception e){ e.printStackTrace();}
		t2.start();
		
	} 

}
