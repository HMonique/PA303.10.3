public class AdultUser implements  LibraryUser {
    private int age;
    private String bookType;

    public AdultUser() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        this.age = age;
        if (age >= 11) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult");
        }
    }

    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}