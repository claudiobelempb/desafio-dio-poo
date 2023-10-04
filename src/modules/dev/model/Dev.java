package modules.dev.model;

import modules.bootcamp.model.Bootcamp;
import modules.content.model.Content;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> registered = new LinkedHashSet<>();
    private Set<Content> completed = new LinkedHashSet<>();

    public void registered(Bootcamp bootcamp){
        this.registered.addAll(bootcamp.getContents());
        bootcamp.getRegistered().add(this);
    }

    public void progression(){
        Optional<Content> content = this.registered.stream().findFirst();
        if(content.isPresent()){
            this.completed.add(content.get());
            this.registered.remove(content.get());
        }else{
            System.err.println("Voçê não esta matriculado em nem um conteudo!");
        }
    }

    public double calcTotalXp(){
        return this.completed
            .stream()
            .mapToDouble(Content::calcXp)
            .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getRegistered() {
        return registered;
    }

    public void setRegistered(Set<Content> registered) {
        this.registered = registered;
    }

    public Set<Content> getCompleted() {
        return completed;
    }

    public void setCompleted(Set<Content> completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(registered, dev.registered) && Objects.equals(completed, dev.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registered, completed);
    }
}
