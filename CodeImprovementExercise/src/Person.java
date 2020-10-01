public class Person {
    //Declarations
    String firstName = "";
    String middleName = "";
    String lastName = "";
    String eyes = "";
    int bYear = 0;

    //Decides the order of the print
    public String getName(boolean fnf) {
        if (fnf) {
            return this.firstName + " " + this.middleName + " " + this.lastName + " (" + this.eyes + ", " + this.bYear + ")";
        } else {
            return this.lastName + ", " + this.firstName + " " + this.middleName + " (" + this.eyes + ", " + this.bYear + ")";
        }
    }
}
