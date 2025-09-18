import java.util.Scanner;
public class J04Ifproblem5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int num = sc.nextInt();
        
        if(num>5){

            System.out.println("첫 수가 크군요!!!");

        }
        else{

            System.out.println("첫 수가 크지 않군요!!!");
        }


    }

}