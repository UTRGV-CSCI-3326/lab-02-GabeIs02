public class MixMatch{
    public static void main(String[] args){
        
        String varString = "Hello";
        System.out.println(varString + " <- String, used for storing sequences of characters.");

        char varChar = 'G';
        System.out.println(varChar + " <- Char, stores a single 16-bit Unicode character.");

        short varShort = 1234;
        System.out.println(varShort + " <- Short, stores whole numbers from -32,768 to 32,767.");

        int varInt = 2147483647; 
        System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647.");

        long varLong = 9223372036854775807L; 
        System.out.println(varLong + " <- Long, stores large whole numbers up to 9,223,372,036,854,775,807.");

        float varFloat = 3.14f; 
        System.out.println(varFloat + " <- Float, stores fractional numbers with up to 6-7 decimal digits.");

        double varDouble = 1.123456789101123;
        System.out.println(varDouble + " <- Double, stores fractional numbers with up to 15 decimal digits.");

        boolean varBoolean = true; 
        System.out.println(varBoolean + " <- Boolean, stores true or false values.");


        System.out.println("Mixing it up: " + varString + ", " + varChar + ", " + varInt + ", " + varDouble + ", " + varBoolean);

         
       
    }
}