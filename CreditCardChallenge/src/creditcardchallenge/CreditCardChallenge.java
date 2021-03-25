package creditcardchallenge;

import java.util.Scanner;

/**
 *
 * @author maste
 */
public class CreditCardChallenge {

    static String[] testData = {"272099998564591", "2720999985645912", "5266509258235496", "5266590258235496", "4916618655349234", "4485735287746637", "4365300588292181483"};
    static boolean[] testResults = {false,false,true,true,false,true,false};
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * new scanner object
         */
        Scanner input = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to the menu.\nThis is here just for testing purposes right now.\nYou may use the values \"t\" or \"test\" in order to run an automated test or \"q\" to quit\n");
        while(running){
            System.out.println("Please input your credit card number without any spaces");
            String numberToCheck = input.nextLine();
        
            switch(numberToCheck){
                case "q":
                    System.out.println("Quit");
                    running = false;
                    break;
                case "quit":
                    System.out.println("Quit");
                    running = false;
                    break;
                case "t":
                    test();
                    break;
                case "test":
                    test();
                    break;
                default:
                    CreditCardChecker creditCardChecker = new CreditCardChecker(numberToCheck);
                    creditCardChecker.validNumberResult();
                    break;
            }
        
            /**
             * Code to be added at a later date in order to accept credit card numbers with spaces.
            * Doesn't work as implemented in the comments.
            */
//        boolean containSpace = numberToCheck.contains(" ");
//        
//        if(containSpace){
//            numberToCheck = numberToCheck.replaceAll(" ", "");
//        }

            /**
            * create credit card object and check the user's card
            */
            
        }
        
    }
    
    public static void test(){
        
        for(int j=0;j<7;j++){
            System.out.println(testData[j]);
            CreditCardChecker bobIsLife = new CreditCardChecker(testData[j]);
            bobIsLife.validNumberResult();
            System.out.println("The expected result should be: " + testResults[j]+"\n");
        }
    }
}
