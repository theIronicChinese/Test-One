/**
 * Created by Dingrong Wynn on 8/3/2016.
 */
public class App {

    public static void main(String[] args) {

        int loop = (int)(Math.random()*10);
        int loop2 = (int)(Math.random()*10 );
        int loop3 = loop + loop2;

        while (true) {
            System.out.println("Looping " + loop + "+" + loop2 + "=" + loop3);

            if(loop3 > 11) {
                break;
            }

            loop3 = loop+loop2;

            System.out.println("Running");
        }

    }
}
