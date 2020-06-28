import java.util.Objects;

/**
 *一个标准的学生类
 * @author Administrator
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    private String subject;

    public Student(String name, int age, String gender, String subject) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.subject = subject;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(subject, student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
