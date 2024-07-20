public class Main {
    public static void main(String[] args) {
        // Example usage:
        Object input = "avs";  // Replace with your input
        
        if (isInteger(input)) {
            int number = Integer.parseInt((String) input);
            System.out.println("Input is an integer: " + number);
        } else {
            System.out.println("Input is not an integer");
        }
    }
    
    public static boolean isInteger(Object input) {
        if (input instanceof String) {
            try {
                Integer.parseInt((String) input);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
}
