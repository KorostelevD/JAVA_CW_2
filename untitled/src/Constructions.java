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
    }
}
