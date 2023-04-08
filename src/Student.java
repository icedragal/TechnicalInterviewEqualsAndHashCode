import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student st = (Student) o;
        return age == st.age && Objects.equals(name, st.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
