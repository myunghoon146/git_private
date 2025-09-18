import java.util.Scanner;
public class J03Scanner {

    public static void main(String[] args) {
     
        Scanner dongas = new Scanner(System.in);

        System.out.print("숫자 하나 입력 : ");
        int inputValue = dongas.nextInt();
        System.out.println("입력한 숫자 :"+inputValue);
        // UI : User Interface, 프로그램 사용하기 위해 이렇게 하면 됩니다~ 저러면 됩ㄴ디ㅏ. 알려주는 것
        // UX: User Experience, UI를 사용하면서 사용자가 느낀 여러가지 경험들. > 설문조사. 만족도조사

        System.out.print("실수 하나 입력 :");
        double inputValue2 = dongas.nextDouble();
        System.out.println("입력한 실수 :" +inputValue2);
        
        System.out.print("한줄 입력 : ");
        String oneLine = dongas.nextLine();
        System.out.print("입력데이터 :" +oneLine);


    }
    
}
