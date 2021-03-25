package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "location is required")
    @Size(min = 3, max = 100)
    private String location;

    //@OneToMany(mappedBy = "employer")
    @OneToMany
    private List<Job> jobs=new ArrayList<>();

    public Employer()
    {

    }
    public Employer(@NotBlank(message = "location is required") @Size(min = 3, max = 100) String location) {
        super();
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
