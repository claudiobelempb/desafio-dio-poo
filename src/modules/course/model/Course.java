package modules.course.model;

import modules.content.model.Content;

public class Course extends Content {

    private Integer workload;

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public Double calcXp() {
        return XP_DEFAULT * workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Title='" + getTitle() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", Workload= " + calcXp() +
                 '}';
    }
}
