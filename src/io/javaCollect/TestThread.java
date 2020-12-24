package io.javaCollect;

public class TestThread {

	/*public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		Runnable ob1 = new Runnable(){
//
//			public void run(){
//				for(int i=1;i<=5;i++){
//					System.out.println("tata");
//					try{ Thread.sleep(500);} catch(Exception e){ e.printStackTrace();}
//				}
//			}
//			
//		};
//		Runnable ob2 = new Runnable(){ //ananymous class
//
//			public void run(){
//				for(int i=1;i<=5;i++){
//					System.out.println("Bye");
//					try{ Thread.sleep(500);} catch(Exception e){ e.printStackTrace();}
//				}
//			}
//			
//		};
		
		Thread t1 = new Thread(()->{
			for(int i=1;i<=5;i++){
				System.out.println("Tata");
				try{ Thread.sleep(500);} catch(Exception e){ e.printStackTrace();}
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=1;i<=5;i++){
				System.out.println("Bye");
				try{ Thread.sleep(500);} catch(Exception e){ e.printStackTrace();}
			}
		});
		t1.start();
		try{ Thread.sleep(10);} catch(Exception e){ e.printStackTrace();}
		t2.start();
		
		t2.join(); //final bye gets executed after join is done 
		System.out.println("final bye");
	}
*/
}
