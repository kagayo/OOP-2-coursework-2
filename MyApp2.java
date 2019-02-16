/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;/**
 *
 * @author Joffrey
 */
public class MyApp2 {
    public static void main(String[] args){
        //TODO Auto-generated method stub
        ArrayList<String> names=new ArrayList<String>();
        ArrayList<String> cses=new ArrayList<String>();
        ArrayList<Double> marks=new ArrayList<Double>();
        int k=1;
        double SUM=0;
        double av=0;
        while(true){
            System.out.print("Enter student"+k+"name:");
            String name=new java.util.Scanner(System.in).nextLine();
            System.out.print("Enter marks:");
            Double mark=new java.util.Scanner(System.in).nextDouble();
            SUM=SUM+mark;
            if(name.equals("exit"))
                break;
            else
                names.add(name);
                marks.add(mark);
                cses.add(cses);
                c++;
                
            }
            System.out.println("name:"+names.get(0));
            System.out.println("cdfg:"+cses.get(0));
            System.out.println("total="+SUM);
            av=SUM/c;
            System.out.println("The average is:"+av);
            k++;
            
            
            
            
            
    }
    }
}
