public class FormLetterWriter {
    public static void main(String[] args) {
        displaySalutation("Sithu");
        System.out.println("Thank you for your recent order.");
        displaySalutation("Aung", "Naing");
        System.out.println("Thank you for your recent order.");
    }
    public static void displaySalutation(String cusLName) {
        System.out.println("Dear Mr. or Mrs. " + cusLName);
    }
    public static void displaySalutation(String fName, String lName) {
        System.out.println("Dear " + fName + " " + lName);
    }
}
