package creditcardchallenge;

/**
 *
 * @author Michael C. Jackson
 * @version 23/10/20
 */
public class CreditCardChecker {

    /**
     * class variables
     */
    private String longNumber;
    private String testNumber;
    
    /**
     * constructor - setting longNumber as the class builders parameter
     * @param input 
     */
    CreditCardChecker(String input) {
        this.longNumber = input;
        this.testNumber = "";
    }
    
    /**
     * Check if correct length - could be private since it's called within this class
     * @return 
     */
    public boolean isCorrectLength(){
        int length = longNumber.length();
        if(length==16){
            return true;
        } else {
            return false;
        }
    }
    
    
    /**
     * get the numbers that will be getting checked - again could be private since it's currently only called within this class
     * @return 
     */
    public String firstFifteen(){
        String firstFifteen = longNumber.substring(0, longNumber.length()-1);
        return firstFifteen;
    }
    
    /**
     * longNumber getter
     * @return 
     */
    public String getLongNumber(){
        return longNumber;
    }
    
    /**
     * calculates the checkNumber using the value from firstFifteen - again, could be private
     * @return 
     */
    public int calculateCheckNumber(){
        int odd =0;
        int even = 0;
        String check;
        String firstFifteen = firstFifteen();
        
        for (int i=0;i<firstFifteen.length();i++){
//            System.out.println(i);
            check = firstFifteen.charAt(i)+"";
            if(i%2==0){
                int x = Integer.parseInt(check);
                x *= 2;
                System.out.println("Checking: " + x + "   " + x%9);
                if (x>9){
                    x -= 9;
                }
                even += x;
                System.out.println("even check: "+check+" x: "+x+" total: "+even);
                                
            } else {
                odd += Integer.parseInt(check);
                System.out.println("odd: "+check+" "+odd);
                
            }
        }
        //check = firstFifteen.charAt(15)+"";
        //int x = Integer.parseInt(check);
        System.out.println("odd: "+odd+" even: "+even);
        int total = odd + even;
        int c = total / 10 * 10 + 10 - total;
        return c;
    }
    
    /**
     * runs the check on the card and informs the user if the card is valid - this one needs to be public
     */
    public void validNumberResult(){
        if(isCorrectLength()){
            int checkNo = calculateCheckNumber();
            int lastCheckNo = Integer.parseInt(longNumber.charAt(15)+"");
            if(checkNo==lastCheckNo){
                System.out.println("Could be valid");
            } else {
                System.out.println("Isn't Valid");
            }
        } else {
            System.out.println("Isn't Valid");
        }
    }
    
}
