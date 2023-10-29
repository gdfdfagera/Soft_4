public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Daulet K");
        Student s2 = new Student("Dimash Y");
        Student s3 = new Student("Dilnaz R");

        University u = new University();

        u.addStudent(s1);
        u.CurrentWeather(new Weather("Bad"));
        u.addStudent(s2);
        u.addStudent(s3);

        u.CurrentWeather(new Weather("Good"));
    }
}
