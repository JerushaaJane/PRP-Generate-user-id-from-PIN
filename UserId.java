import java.util.*;
public class UserId {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[2];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextLine();
        }
        String PIN=sc.nextLine();
        int N=sc.nextInt(); //position in pin
        printResult(a,PIN,N);
        
    }
    
    static String[] alphaOrder(String[]a){
        String temp;
        for(int i=0;i<a.length;i++){                    //sort
            for(int j=i+i;j<a.length;j++){
                if(a[i].compareTo(a[j])>0){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //for(int i=0;i<a.length;i++){               //print sorted array
        //    System.out.println(a[i]);
        //}
        return a;
        
    }
    static String swapCase(String id){
        StringBuffer sb=new StringBuffer(id);    
        for(int i = 0; i < id.length(); i++) {    
            if(Character.isLowerCase(id.charAt(i))){
                sb.setCharAt(i,Character.toUpperCase(id.charAt(i)));
                
            } 
            else if(Character.isUpperCase(id.charAt(i))){
                sb.setCharAt(i,Character.toLowerCase(id.charAt(i)));
            }
               
        } 
        return sb.toString();
        
    }
        
    
    
    static String userIdGeneration(String smallerName,String largerName,String PIN,int N){
        String b="";
        int pos=N;
         b+=PIN.charAt(pos-1);
        b+=PIN.charAt(PIN.length()-pos);
        //System.out.println(b);
   
        String id=largerName.charAt(0)+smallerName+b;
        id=swapCase(id);
       
        return id;
    }
    

    
    static void printResult(String[]a,String PIN,int N){
        String userId;
        String smallerName,largerName;
        String fname=a[0],sname=a[1];
        int fnameLength=fname.length();int snameLength=sname.length();
        
        if(fnameLength<snameLength){
            smallerName=fname;
            largerName=sname;
            userId=userIdGeneration(smallerName,largerName,PIN,N);
            System.out.println(userId);
            
        }
        else if(fnameLength>snameLength){
            largerName=fname;
            smallerName=sname;
            userId=userIdGeneration(smallerName,largerName,PIN,N);
            System.out.println(userId);
            
            
            
        }
        else if(fnameLength==snameLength){
            String b[]=new String[2];
            b=alphaOrder(a);
            smallerName=b[0];
            largerName=b[1];
            userId=userIdGeneration(smallerName,largerName,PIN,N);
            System.out.println(userId);
            
            
        }
        
    }
}
