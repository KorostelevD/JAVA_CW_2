public class DataTypes {
    public static void main(String[] args) {

        //Примітиви
        /*
        Числові, цілі типи
        byte 1 байт
        short 2 байт
        int 4 байт
        long 8 байт

        Числові дробні типи
        float   4
        double  8

        Логічний типї
        boolean 4 (в массиві 1 байт)

        Символьний тип
        char 2 байта 65536 символів
         */

        //Класи обгортки (для примітивів)(Посилальні типи)
        /*
        Числові, цілі типи
        byte        Byte
        short       Short
        int         Integer *
        long        Long

        Числові дробні типи
        float   FLoat
        double  Double

        Логічний типї
        boolean     Boolean

        Символьний тип
        char        Cheracter *
         */

        //запис значень
        int i = 12;
        i = 1_000_00;
        long l = 10000000000L;
        float f = 0.3F;
        double d = 1d;
        d = 0.3;
        d = 0.;
        d = .3;

        boolean b = true;

        char c = '*';
        c = 49;
        c = '\n';
        c = '\0';
        c = '\t';
        c = '\u0000';
        c = '\u2192';
        System.out.println(c);

        Object object = new Object();
        //Integer integer = new Integer(12);
        //Упаковка
        Integer integer = 12;
        i = integer;
        //
        integer = null;

        //Прімітиви Знакові signer

        int i1 = Integer.parseInt("123");
        Integer integer1 = Integer.valueOf("123");
        System.out.println(integer1);
        String string = Integer.toString(123);
        String string1 = Integer.toString(10, 16);
        System.out.println(string1);

        //Byte

        boolean aTrue =Boolean.parseBoolean("True");
        System.out.println(aTrue);

        //Char символи
        char a = Character.toUpperCase('d');
        System.out.println(a);

        c = 'a';
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isAlphabetic(c));
        System.out.println(Character.getName(c));

        int type = Character.getType(c); //2
        System.out.println(type == Character.LOWERCASE_LETTER);
        //
        i = 1_000_000;
        System.out.println(i);


        //ОСНОВНІ КОНСТРУКЦІЇ

    }
}