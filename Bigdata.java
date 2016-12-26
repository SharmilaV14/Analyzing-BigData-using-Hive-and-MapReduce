/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdata;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author knith,sharmiv
 */
public class Bigdata {

    /**
     * @param args the command line arguments
     */
    
    String s;
     public static void main(String[] args) throws IOException {
      int count=1;
        
String before=null;        
			String sCurrentLine;

try (BufferedReader br = new BufferedReader(new FileReader("D://Fire_Department_Calls_for_Service.csv")))
		
{            while ((sCurrentLine = br.readLine()) != null ) {

    if(count>=1){
    
    String s2[];
    String s21[],s22[];
    String s1[]=sCurrentLine.split(",");
 String s6[]=s1[15].split(" ");
   if(before!=s1[0] && s1.length==35 )//&& !s1[21].contentEquals("A") && !s1[21].contentEquals("E") && !s1[21].contentEquals("\t") && !s1[23].contentEquals("A") && !s1[23].contentEquals("E") && !s1[23].contentEquals("B")&& !s1[23].contentEquals("C") && !s1[23].contentEquals("D")  && !s1[23].contentEquals(null)    && !s1[21].contentEquals("1") && !s1[21].contentEquals("2") && !s1[21].contentEquals("3") )
    //s1[3];
//if(before!=s1[0] && s1[23].contentEquals("") )
 {
    s2=s1[4].split("/");
    s21=s1[6].split(" ");
    if(s2.length==3 && s21.length==3)
    {
        s22=s21[1].split(":");
        if(s22.length==3)
     {
            String s3=s2[0];
            String s4=s2[1];
            String s5=s2[2];
           String st="null";
          //System.out.println(s6.length);
       int count1=1;
       for(int i=1;i<s6.length;i++)
          {
              if (s6[i].equalsIgnoreCase("ST"))
                      {
                         st=(s6[i-1]);
                          i=s6.length;
                      }
              else {
                  st="Not a street";
              }
          
          }
          int a;
           //System.out.println(s21[2]);
            if(s21[2].contains("PM"))
           {
               //System.out.println("ellindi roy");
           a=Integer.parseInt(s22[0])+12;
           }
            else {
                a=Integer.parseInt(s22[0]);
           }
        Calendar cal=Calendar.getInstance();
cal.set(Integer.parseInt(s2[2]), Integer.parseInt(s2[0]), Integer.parseInt(s2[1]));
 String day=new SimpleDateFormat("EEE").format(cal.getTime());
 //if(count>233)
System.out.println(s1[3].replaceAll("\\s+","")+","+day+","+s2[0]+","+s2[1]+","+s2[2]+","+a+","+s1[13].replaceAll("\\s+","")+","+st+","+s1[17]+","+s1[18]+","+s1[19]+","+s1[20]+","+s1[21]+","+s1[23]+","+s1[25]+","+s1[27]+","+s1[31]+","+s1[32].substring(2,s1[32].length()-1)+","+s1[33].substring(0,s1[33].length()-2));
 
 //System.out.println(s1[21]+"nithin");       
before=s1[0];
count=count+1;

     }
}
}
    }    
}
//System.out.println(count);

}
catch (IOException e) {
			e.printStackTrace();
		}
 }
}
  
