import java.util.*;
public class DFA{
    public static void main(String []args)  
{ 
    
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter String to check : ");
   String str = sc.next();
   int accept=0;
   String l[]={"rahul","rhaul","ahul","haul","hul","ul","l"};
   for( int i=0; i<l.length; i++){
       if(str.equals(l[i])){
           
         accept=1;
       }
      
   }
   sc.close();
   if(accept==1){
    System.out.println("accepted");
   } 
   else{
    System.out.println("not accepted");
   }
} 

}