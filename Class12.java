package myJava15;
class CTest4 implements Runnable
{
   private String id;
   public CTest4(String str)
   {
      id=str;
   }
   public void run()
   {
      for(int i = 0;i <= 5;i++)
      {
         try {
        	 Thread.sleep((int)Math.random()*2);
         }catch(InterruptedException e) {}
    	 System.out.println(id+" "+i);
      }
   }
}
public class Class12 {

	public static void main(String[] args) {
		CTest3 hi = new CTest3("Hello");
		CTest3 bye = new CTest3("Good Bye");
		CTest3 mornig = new CTest3("Good mornig");
		CTest3 night = new CTest3("Good night");
		Thread h = new Thread(hi);
		Thread b = new Thread(bye);
		Thread m = new Thread(mornig);
		Thread n = new Thread(night);
		h.start();
		try {
			h.join();
			m.start();
			m.join();
			n.start();
			h.join();
			b.start();
			b.join();	
		}catch(InterruptedException e) {}
		System.out.println("All threads are finished");
	}

}
