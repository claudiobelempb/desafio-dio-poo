package modules.mentoring.model;

import modules.content.model.Content;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate createdAt;

    public Mentoring() {
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public Double calcXp() {
        return XP_DEFAULT + 20;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Title='" + getTitle() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", Created='" + createdAt + '\'' +
                ", Workload= " + calcXp() +
                '}';
    }
}
