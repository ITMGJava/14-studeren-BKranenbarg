import java.util.Arrays;

public class Universiteit {
    public static void main(String[] args) {
       Studie st = new Studie();
       Student s1 = new Student();
       Student s2 = new Student();
       s1.setNaam("Alex Zhao");
       s1.studentnummer=" 89789";
       s2.setNaam("Peter Roest");
       s2.studentnummer=" 72642";
       st.Studenten[0]= s1.getNaam() + s1.studentnummer;
       st.Studenten[1]= s2.getNaam() + s2.studentnummer;
       for (int i= 0; i < st.Studenten.length; i++) {
          System.out.println(st.Studenten[i]);
       }

       st.vakken();
       st.zoekStudent(s1.studentnummer);

    }
}
