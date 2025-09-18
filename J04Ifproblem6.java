import java.util.Scanner;
public class J04Ifproblem6{

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 하나 입력: ");
            int num = sc.nextInt();

            if(num>0){

                System.out.println("양수");
            }

            if(num<0){
                System.out.println("음수");  
            }

            else{
                System.out.println("0");
            }


        }

                            }