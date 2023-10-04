package modules.bootcamp.model;

import modules.content.model.Content;
import modules.dev.model.Dev;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate start = LocalDate.now();
    private final LocalDate end = start.plusDays(45);
    private Set<Dev> registered = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public Set<Dev> getRegistered() {
        return registered;
    }

    public void setRegistered(Set<Dev> registered) {
        this.registered = registered;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(start, bootcamp.start) && Objects.equals(end, bootcamp.end) && Objects.equals(registered, bootcamp.registered) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, start, end, registered, contents);
    }
}
