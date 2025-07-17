package com.spring;

import java.util.Objects;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private String techstack;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String name, String techstack) {
        this.id = id;
        this.name = name;
        this.techstack = techstack;
    }

    public Integer getId() {
        return id;
    }

    public String getTechstack() {
        return techstack;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTechstack(String techstack) {
        this.techstack = techstack;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techstack, that.techstack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techstack);
    }
}
