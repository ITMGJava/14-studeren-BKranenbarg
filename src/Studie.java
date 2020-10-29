public class Studie {
    String Naam = "Culturele Antrolologie";
    String [] Studenten = new String[10];
    String [] Vakken = new String[]{"onderzoeksmethoden", "religie", "burgerschap", "globalisatie"};

    void vakken() {
        for (int teller=0; teller < Vakken.length; teller++)
        System.out.println(Vakken[teller]);
    }

    Student zoekStudent(String studentnr) {
        Student student = new Student();
        
        return student;

    }


}
