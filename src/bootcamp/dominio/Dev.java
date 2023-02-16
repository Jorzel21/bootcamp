package bootcamp.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Subject> subscribedSubjects = new LinkedHashSet<>();
    private Set<Subject> finishedSubjects = new LinkedHashSet<>();

    public void subscribedBootcamp(Bootcamp bootcamp){
        this.subscribedSubjects.addAll(bootcamp.getSubjects());
        bootcamp.getDevs().add(this);
    }

    public void progress(){
        Optional<Subject> subject = this.subscribedSubjects.stream().findFirst();
        if(subject.isPresent()) {
            this.finishedSubjects.add(subject.get());
            this.subscribedSubjects.remove(subject.get());
        } else{
            System.err.println("Você não está matriculado em nenhum curso.");
        }
    }

    public double calcTotalXp(){
        return this.finishedSubjects.stream().mapToDouble(Subject::calcXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subject> getSubscribedSubjects() {
        return subscribedSubjects;
    }

    public void setSubscribedSubjects(Set<Subject> subscribedSubjects) {
        this.subscribedSubjects = subscribedSubjects;
    }

    public Set<Subject> getFinishedSubjects() {
        return finishedSubjects;
    }

    public void setFinishedSubjects(Set<Subject> finishedSubjects) {
        this.finishedSubjects = finishedSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedSubjects, dev.subscribedSubjects) && Objects.equals(finishedSubjects, dev.finishedSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedSubjects, finishedSubjects);
    }
}
