public interface LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidOne = new KidUser();
        kidOne.setAge(10);
        kidOne.setBookType("Kids");
        kidOne.registerAccount();
        kidOne.requestBook();

        kidOne.setAge(18);
        kidOne.setBookType("Fiction");
        kidOne.registerAccount();
        kidOne.requestBook();

        AdultUser adultOne = new AdultUser();
        adultOne.setAge(5);
        adultOne.setBookType("Kids");
        adultOne.registerAccount();
        adultOne.requestBook();

        adultOne.setAge(23);
        adultOne.setBookType("Fiction");
        adultOne.requestBook();
        adultOne.registerAccount();

    }
}
