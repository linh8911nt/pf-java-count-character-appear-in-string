import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String anyString = input.nextLine();
        System.out.println("Enter character to compare: ");
        char anyCharacter = input.next().charAt(0);
        System.out.println("Character " + anyCharacter + " xuất hiện số lần: " + countCharacterAppear(anyString, anyCharacter));
    }

    public static int countCharacterAppear(String anyString, char anyCharacter) {
        int count = 0;
        for (int i = 0; i < anyString.length(); i++) {
            char characterInString = anyString.charAt(i);
            if (anyCharacter == characterInString)
                count++;
        }
        return count;
    }
}
