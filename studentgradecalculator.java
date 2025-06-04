
import java.io.*;
import java.util.*;
public class studentgradecalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of subjects");
        int n=sc.nextInt();
        float arr[]=new float[n];
        System.out.println("Enter the marks obtained in each subject");
        for(int i=1;i<=n;i++)
        {
             System.out.println("Marks obtained in subject "+i);
             arr[i-1]=sc.nextFloat();
        }
        int j=0;
        float tm=0;
        while(j<n)
        {
            tm=tm+arr[j];
            j++;
        }
        System.out.println("Total marks obtained in all subject = "+tm+" out of "+n*100 );
        float avgp= tm/n;
        System.out.println("The average percentage obtained = "+avgp );
        if(avgp>=80 && avgp<=100)
        {
            System.out.println("Grade obtained: Grade A (Outstanding!)");
        }
        else if(avgp>=60 && avgp<=79)
        {
            System.out.println("Grade obtained: Grade B (Good)");
        }
        else if(avgp>=50 && avgp<=59)
        {
            System.out.println("Grade obtained: Grade C (Average)");
        }
        else
        {
            System.out.println("Grade obtained: Grade D (Fail)");
        }
    }
}
    
    
