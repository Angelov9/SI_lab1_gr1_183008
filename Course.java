
public class Course {

    List<Student> students;

    public  Course(){
        this.students = new ArrayList<>();
    }

    public Course(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student) {
        return this.students.add(student);
    }

    public boolean removeStudent(Student student) {
        return this.students.remove(student);
    }

    public int signatures(){
        return (int) students.stream().filter(Student::hasSignature).count();
    }

    public double averageScore(){
        return students.stream().mapToDouble(Student::getAverage).sum();
    }

}