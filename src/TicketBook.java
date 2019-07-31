

/* 
* What is Thread? 
* Thread is light weight sub-process 
* To achieve Multitasking. 
* 
* How to create a Thread? 
* There two ways we can create a thread 
* a)By extending Thread class 
* b)By Implementing Runnable Interface 
* 
* Does it has any LifeCycle? 
* ans)Yes,as it is running independently, so it has its own life cycle. 
* 
*/ 
public class TicketBook extends Thread 
{ 
public void run() //Your execution must be kept inside the run method 
{ 
for(int i=1;i<=10;i++) 
{ 
try 
{ 
Thread.sleep(1000); 
} catch (InterruptedException e) 
{ 
// TODO Auto-generated catch block 
e.printStackTrace(); 
} 
System.out.println(i); 
} 
} 

public static void main(String[] args) 

{
 
TicketBook t1=new TicketBook();//Thread is in new born state
 
TicketBook t2=new TicketBook();
 
TicketBook t3=new TicketBook();
 
//TicketBook t1=new TicketBook();
 
t1.start();//when you call start method then it comes into runnable
 
try {
 
t1.join();
 
} catch (InterruptedException e) {
 
// TODO Auto-generated catch block
 
e.printStackTrace();
 
}
 
t2.start();
 
try {
 
t2.join();
 
} catch (InterruptedException e) {
 
// TODO Auto-generated catch block
 
e.printStackTrace();
 
}
 
t3.start();
 
}

}