import java.util.Scanner;

public class MIS_prog5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Using String methods
        System.out.println("Enter the movie title:");
        String title = input.nextLine();
        System.out.println("Title in uppercase: " + title.toUpperCase());
        System.out.println("Title in lowercase: " + title.toLowerCase());
        System.out.println("Length of the title: " + title.length());
        System.out.println("Enter a word to search in the title:");
        String search = input.next();
        System.out.println("The word '" + search + "' is present in the title: " + title.contains(search));
        System.out.println("First word of the title: " + title.split(" ")[0]);
        System.out.println("Last word of the title: " + title.substring(title.lastIndexOf(" ") + 1));
        System.out.println("Title without leading or trailing spaces: " + title.trim());
        System.out.println("Title with all spaces replaced by underscores: " + title.replace(" ", "_"));
        System.out.println("Title with first and last character removed: " + title.substring(1, title.length() - 1));

        // Using StringBuffer classes
        StringBuffer buffer = new StringBuffer(title);
        System.out.println("Original title: " + buffer);
        buffer.reverse();
        System.out.println("Title in reverse: " + buffer);
        buffer.setCharAt(0, 'T');
        System.out.println("Title with first letter replaced: " + buffer);
        buffer.append(" (2022)");
        System.out.println("Title with year added: " + buffer);
        buffer.delete(0, 7);
        System.out.println("Title with first 7 characters removed: " + buffer);
        buffer.insert(0, "The ");
        System.out.println("Title with 'The' added at the beginning: " + buffer);
        buffer.replace(0, 3, "This");
        System.out.println("Title with 'The' replaced by 'This': " + buffer);
        buffer.setLength(10);
        System.out.println("Title truncated to 10 characters: " + buffer);
        buffer.ensureCapacity(50);
        System.out.println("Title buffer capacity increased to 50: " + buffer.capacity());
    }

}
