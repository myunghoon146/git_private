public class J01Variable
{
    public static void main(String[] args)
    {
        int number=10;
        int number2=20;
        //int number3=3.3;
        // int number4="치즈가츠동";
        double number3 = 3.3;
        String str = "치즈가츠동";

        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(str);

        byte num1 = 127;
        System.out.println("바이트: 1Byte," +num1);
        short youtube = 32767;
        System.out.println("쇼츠: 2Byte," + youtube);
        int intel = 210000000;
        System.out.println("인트 : 4 Byte" + intel);
        long cheeseStick = 16;
        System.out.println("롱: 8byte," +cheeseStick);
        float fifaOnline = 3.14f;
        System.out.println("플로트 : 4Byte"+fifaOnline);
        double burger = 3.141592;
        System.out.println("더블로가 : 8 Byte" + burger);
        char car = 'A';
        System.out.println("차차차: 2Byte," +car);
        boolean fire = true;
        System.out.println("불리언:1Byte,"+fire);


    }
}