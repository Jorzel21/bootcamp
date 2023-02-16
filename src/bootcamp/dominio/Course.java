package bootcamp.dominio;

public class Course extends Subject {
    private int hoursClass;
    @Override
    public double calcXp() {
        return DEFAULT_XP * getHoursClass();
    }
    public Course() {
    }

    public int getHoursClass() {
        return hoursClass;
    }

    public void setHoursClass(int hoursClass) {
        this.hoursClass = hoursClass;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", hoursClass=" + hoursClass +
                '}';
    }
}
