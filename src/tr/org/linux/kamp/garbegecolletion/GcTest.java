package tr.org.linux.kamp.garbegecolletion;

public class GcTest {
  int value;

protected void finalize() throws Throwable{
	  super.finalize();
	  System.out.println("Garbage collector çalıştı");
  }
}
