public class Constructions {
    public static void main (String[] args){
        if (true){
        }else if (false) {
        }else{
        }
        //
        String s = true ? "+" : "-";
        System.out.println(true ? "+": "-");
        //

        //Java 10+
       int res = switch (4){
           case 1 -> 10;
           case 2, 3 -> 2030;
           case 4 -> {
               System.out.println(40);
               yield 40; // return для switсh повернення значення
           }
           default -> 0;
       };
        System.out.println(res);
        //

        //цикли
        while (res > 0){
            res --;
        }
        do {
            System.out.println();
        }
        while (false);

        //
        for (int cnt = 0; cnt < 100; cnt++) {
            System.out.println(cnt + " ");
        }

        //Перебирає елементи, тут массива
        char[] charArray = "abcde".toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        // ПОМИЛКИ

        try {
            System.out.println(1/0);
        }
        catch (Exception e){
            e.printStackTrace(System.err);
        }
        finally {
            System.out.println();
        }

        someMethod(111);
    }

    public static void someMethod (int i){
        if (i == 0)
            return;
        System.out.println(i);
    }
}
