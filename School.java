import java.util.*;

public class Person{
    private int dna;
    private String name;
    private String lastName;
    private PersonType personType;
}

public class PersonType{
    private int IdPersonType;
    private String description;
}

public class Subject{
    private int idSubject;
    private String subjectName;
    private List<Person> students;
    private Person teacher;
    public ArrayList<Person> getStudents(){
        return students;
    }
}

public class School{

    private Person principal; 
    private ArrayList<Subject> subjects;
    public List<Person> getStudentsByLastName(){
        Query query = session.createQuery("select DISTINCT LastName, FirstName, DNA 
                                           from Subject inner join Person
                                            on Person.dna=Subject.studentDna
                                            order by LastName");
        return query.list(); //calls a method that transforms the data into a List<Student>
    }
    
    public List<Person> getStudentsBySubject(Subject oSubject){
        return subjects.indexOf(oSubject).getStudents();
    }

}