package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

  /*  @Id
    @GeneratedValue
    private int id;*/

    //private String name;

    @ManyToOne
    //@JoinColumn(name = "employer_id")
    @JoinColumn
    private Employer employer;
    @ManyToMany

    private  List<Skill> skills = new ArrayList<>();;

    public Job() {
    }

    public Job(String name,Employer anEmployer, List<Skill> someSkills) {
        super();
        this.setName(name);
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
