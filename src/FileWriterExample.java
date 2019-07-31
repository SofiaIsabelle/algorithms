import java.io.*;
public class FileWriterExample {  
    public static void main(String args[]){    
           try{
           FileReader fr=new FileReader("E:\\testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
}
  catch(IOException ie)
{
 ie.printStackTrace();
}
          int a=50,b=100;
    System.out.println(a+b);
     }    
}