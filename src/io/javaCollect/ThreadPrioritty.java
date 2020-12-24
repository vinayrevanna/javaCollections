package io.javaCollect;

public class ThreadPrioritty {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(()->{
						for(int i=1;i<=5;i++){
							System.out.println("Hi  "+Thread.currentThread().getPriority());
							try{ Thread.sleep(500);} catch(Exception e){ e.printStackTrace();}
						}
					},"hi thread");
					Thread t2 = new Thread(()->{
						for(int i=1;i<=5;i++){
							System.out.println("Hello  "+Thread.currentThread().getPriority());
							try{ Thread.sleep(500);} catch(Exception e){ e.printStackTrace();}
						}
					},"hello thread");
					//t1.setName("hi thread");
					//t2.setName("hello thread");
					System.out.println(t1.getName());
					System.out.println(t2.getName());
					System.out.println(t1.getPriority());
					System.out.println(t2.getPriority()); //range of proirity from 1 to 10(highest)
					//t1.setPriority(1); min priorith
					t1.setPriority(Thread.MIN_PRIORITY); 
					//t2.setPriority(10);
					t2.setPriority(Thread.MAX_PRIORITY); 
					t1.start();
					try{ Thread.sleep(10);} catch(Exception e){ e.printStackTrace();}
					t2.start();
					
					t2.join(); //final bye gets executed after join is done 
					System.out.println("final bye");
	}

}
