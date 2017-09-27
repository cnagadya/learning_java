class GenderOptions {
    enum GenderValue{ Male, Female, Unknown }
    GenderValue gender;
}

public class Gender {
    
    public static void main(String args[]) {
        GenderOptions person = new GenderOptions();
        person.gender = GenderOptions.GenderValue.Male ;
        System.out.println("Your Gender is  " + person.gender);
    }
}
