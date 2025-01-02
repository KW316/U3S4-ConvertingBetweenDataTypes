public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        String shirtPrice = "34";
        String taxRate = "54.0";
        String gibberish = " ad5464dgh5";
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        double total = Integer.parseInt(shirtPrice) + Double.parseDouble(taxRate);
        System.out.println(total);
        //Try to parse taxRate as an int
        int a = (int) Double.parseDouble(taxRate);
        System.out.println(a);
        //Try to parse gibberish as an int
        System.out.println(Integer.parseInt(gibberish));
    }
    
}
