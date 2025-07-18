public class StringMethods { 
    public static void main(String[] args) {
        String quote = " Learn Java with Yusu ";

        System.out.println("Original: '" + quote + "'");
        System.out.println("Trimmed: '" + quote.trim() + "'");
        System.out.println("Uppercase: " + quote.toUpperCase());
        System.out.println("Contains 'Java'? " + quote.contains("Java"));
        System.out.println("Starts with ' Learn'? " + quote.startsWith(" Learn"));
        System.out.println("Replaced: " + quote.replace("Yusu", "GPT"));
    }
}

