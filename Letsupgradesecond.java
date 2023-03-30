import java.util.Scanner;
class Demo
{
    void sum()
    {
        Scanner obj=new Scanner(System.in);
        int frist,second,result;
        System.out.println("Enter a frist number : ");
        frist=obj.nextInt();
        System.out.println("Enter a second number : ");
        second=obj.nextInt();
        result=frist+second;
        System.out.println("the sum of these two number is : "+result);

    }
    
}
public class Letsupgradesecond {
    public static void main(String [] args)
    {
        Demo mir=new Demo();
        mir.sum();
    }
}
