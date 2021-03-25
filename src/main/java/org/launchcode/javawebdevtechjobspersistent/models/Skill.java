package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 3, max = 500)
    private String description;
    @ManyToMany(mappedBy="skills")
    private List<Job> jobs=new ArrayList<>();
    public Skill(@Size(min = 3, max = 500) String description) {
        this();
        this.description = description;
    }
    public Skill() {
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}