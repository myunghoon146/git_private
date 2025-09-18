public class J02Print{

    public static void main(String[] args)
    {
        System.out.print("안녕하세요");
        System.out.print(" 날이");
        System.out.print(" 참 좋죠? ");


        //printf("넣고싶은 말.. %? %?", 변수, 변수)
        // %어쩌고랑 뒤에 변수랑 자료형, 개수가 딱 맞아야함.
        // %d: 정수, %f: 실수, %c:문자, %s: 문자열


        //실수(소수점이 있는 숫자)를 출력해보자
        double burger = 123.456;
        double pi = 3.14;
        System.out.println(burger + "/" +pi);
        System.out.printf("%f / %f/n",burger,pi);
        System.out.printf("%.1f / %.2f/n", burger,pi);

        //문자열 출력하기 
        String cheese = "치즈스틱은 롯데리아입니다.";
        String reject = "반박시 여러분들이 맞습니다.";
        System.out.println(cheese+ " " +reject);
        System.out.printf("%s %s/n", cheese,reject);
        System.out.printf("배고픈가? : %s/n", "겁나배고픕니다.");



















    }













            }