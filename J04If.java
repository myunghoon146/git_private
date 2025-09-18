import java.util.Scanner;
public class J04If {

   


    public static void main(String []args) {

        Scanner woodong = new Scanner(System.in);
        int inputValue;
        System.out.print("숫자 하나 입력 : ");
        inputValue = woodong.nextInt();

        //예제 1. 숫자하나 입력 받아서 짝수 홀수 출력하기
        System.out.println("====Quiz1====");
        if (inputValue%2 == 0){

            System.out.println("InputValue is Even");
        }
        else {

            System.out.println("InputValue is Odd");
        
              }
      //예제 2. 입력받은 숫자가 2의 배수이고 3의 배수이면 야호 
      // 그렇지 않으면 아무것도 출력 X

      if (inputValue%2 ==0){

        if (inputValue%3 ==0){

            //3의 배수의 경우
            System.out.println("Yahoo~!");

        }

      }
    
      if(inputValue%2 == 0 && inputValue%3 == 0){

        System.out.println("Yahoo!");

      }
      else {} // 2의 배수가 아니거나 3의 배수가 아니거나 둘다 아니거나 
    
    // inputValue 0보다 크면 '양수',
    // 0보다 작으면 "음수",0이면 "0"을 출력하세요.
    // if, else 편하게

    if (inputValue>0){

        System.out.println("양수");



    }

    else {

        System.out.println("음수");

    }

      

    
    }
}