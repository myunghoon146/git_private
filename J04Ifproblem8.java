import java.util.Scanner;
public class J04Ifproblem8{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력: ");
        int gradenumber = sc.nextInt();

        if(gradenumber>=90){
            
            System.out.println("A Grade");

        }

        else if(gradenumber>=80){

            System.out.println("B Grade");
        }

        else if(gradenumber>=70){

            System.out.println("C Grade");
        }

        else{
            System.out.println("F Grade");
        }

    }

                            }