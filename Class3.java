package myJava15;
class CTest2 extends Thread
{
   private String id;
   public CTest2(String str)
   {
      id=str;
   }
   public void run()
   {
      for(int i = 0;i <= 5;i++)
      {
         for(int j = 0;j < 100000000;j++) {
        	 System.out.println(id+" "+i);
         }
      }
   }
}
public class Class3 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good Bye");
		hi.start();
		bye.start();
	}

}
