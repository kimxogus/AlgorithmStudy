import java.util.Scanner;

public class Star
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String[] strArr = new String[input - 1];

        StringBuffer strBuffer;
        for(int i=0, len=strArr.length; i<len; i++)
        {
            strBuffer = new StringBuffer();
            for(int j=0, lenGap=input-(i+1); j<lenGap; j++)
            {
                strBuffer.append(' ');
            }
            for(int j=0, lenStar=i*2+1; j<lenStar; j++)
            {
                strBuffer.append('*');
            }
            strArr[i] = strBuffer.toString();
        }

        for(String str : strArr)
        {
            System.out.println(str);
        }

        strBuffer = new StringBuffer();
        for(int i=0, lenStar=input*2-1; i<lenStar; i++)
        {
            strBuffer.append('*');
        }
        System.out.println(strBuffer.toString());

        for(int i=strArr.length-1;i>=0;i--)
        {
            System.out.println(strArr[i]);
        }
    }
}