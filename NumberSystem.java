import static java.lang.System.exit;
import java.util.*;
public class NumberSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Decimal Number to any Number System");
        System.out.print("Decimal Number: ");
        int num=sc.nextInt();
        System.out.println("Enter...\n1.Binary System\n2.Octal System\n3.HexaDecimal\n4.Exit");
        for (int i = 0; ; i++) {
        int ch = sc.nextInt();
        switch(ch){
            case 1:
            System.out.println(Binary(num));
            break;
            case 2:
            System.out.println(Octal(num));
            break;
            case 3:
            System.out.println(HexaDecimal(num));
            break;
            case 4:
            exit(0);
        }
    }
}
    public static int Binary(int num){
        int rem;
        int binary=0;
        int base=1;
        while(num!=0){
            rem=num%2;
            binary=binary+rem*base;
            base=base*10;
            num=num/2;
        }
        return binary;
    }
    public static int Octal(int num){
        int rem;
        int octal=0; 
        int base=1;
        while(num!=0){
            rem=num%8;
            octal=octal+rem*base;
            base=base*10;
            num=num/8;
        }
        return octal;
    }
    public static String HexaDecimal(int num){
        String hexa="";
        while(num!=0){
            int rem=num%16;
            if(rem<10){
                hexa=rem+hexa;
            }else{
                char ch=(char)(rem-10+'A');
                hexa=ch+hexa;
            }
            num=num/16;
        }
        return hexa;
    }
}