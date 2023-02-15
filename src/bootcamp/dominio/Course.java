package bootcamp.dominio;

public class Course {
    private String title;
    private String description;
    private int hoursClass;

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", hoursClass=" + hoursClass +
                '}';
    }
}
