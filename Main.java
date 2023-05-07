
public class Main {
    public static void main(String[] args) {
        // create a Man object
        Man personMan = new Man("Alex", "Noe", 70, null, "reading");

        // create a Woman object
        Woman personWoman;
        personWoman = new Woman("Lina", "Glue", 30, null, "puzzles");

        //is retired
        System.out.println("Is " + personMan.getFirstName() + " " + personMan.getLastName() + " retired? " + personMan.isRetired());
        System.out.println("Is " + personWoman.getFirstName() + " " + personWoman.getLastName() + " retired? " + personWoman.isRetired());

        // register partnership between man and woman. woman take last name of man
        personMan.registerPartnership(personWoman);
        System.out.println(personWoman.getFirstName()+ " after registration is "+personWoman.getFirstName()+" "+personWoman.getPartner().getLastName());
    }
}