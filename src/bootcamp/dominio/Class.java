package bootcamp.dominio;

import java.time.LocalDate;

public class Class extends Subject{
    private LocalDate date;


    @Override
    public double calcXp() {
        return DEFAULT_XP + 20d;
    }
    public Class() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Class{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

}
