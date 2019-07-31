
public class RuntimeExceptionsExample {
 public static void main(String[] args)
 {
  /*
   * Array is collection of elements of Similar data type
   * 
   * Array Intialization
   * a[0]=33 -->0 is index number of array
   * a[1]=44
   * a[2]=55
   * a[3]=66
   * int a[]= {33,44,55,66};-->Declaration and intialization
   */
 int a[]= {33,44,55,66};
 /*
  * Why should we handle exception
  * ans)To continue the flow of execution 
  * 
  * what are the mechanism to handle exceptions?
  * a)try b)catch c)finally d)throw e)throws 
  * 
  * try and catch will allways be in combination
  * try and finally block in combination
  * try catch finally
  * 
  * Note: If we did not handle right exception in the catch block then the programme will be terminated.
  * Raising same exception(ArrayIndexOutOfBoundException)
  * 
  * Can we handle multiple exceptions using single catch block?
  * ans)Yes "catch(ArithmeticException | ArrayIndexOutOfBoundsException e1)"
  * 
  * Can we have multiple Catchblock for single try block?
  * ans)yes
  * 
  * What if finally block and Finally block?
  * I you would like to execute mandatory code then that code must be kept in finally block
  * Because finally make sures that it will be executed must.
  */
 try
 {
  int x=25/0;  //Arithmetic Exception
 System.out.println(a[4]);
 //System.out.println(a[2]/0);
 //System.out.println(a[4]); //ArrayIndexOutOfBoundException
 }
 catch(ArithmeticException e1)
 {
  
  System.out.println("Mathematical Exception please insert valid data");
  //System.out.println("You have entered an Index value greater than 3 which is not allowed");
 }
 catch(ArrayIndexOutOfBoundsException e2)
 {
 e2.printStackTrace(); 
  System.out.println("Exception Occured due to IndexOutOfBound");
 }
 finally
 {
  System.out.println("I will be executed always: I mean exception raises or does not raise");
 }
 System.out.println("The remaining code:");
 }
}