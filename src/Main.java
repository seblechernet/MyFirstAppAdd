public class Main {

    public static void main(String[] args) {
        // This is my first Java Application with Fi
        //This is my first comment
        /*multiline comments
         * i can put my coments on many lines
         * as many as want*/

        System.out.println("Hello World!");
        /*int count = 5;
        if (count ==5)
        {
            System.out.println("WoooHoo!!!");
        }*/

        for(int  count=1;count<=10;count++)
         {


             if (count==5){
                 System.out.println("Woohoo");
             }
             else {
                 System.out.println(count);

             }

            }

        int count = 1;
        do {
            if (count == 5) {
                System.out.println("Woohoo");
            } else {
                System.out.println(count);
            }
            count++;
            }while (count <= 10);

    }
}
