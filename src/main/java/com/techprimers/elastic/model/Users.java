package com.techprimers.elastic.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "users", type = "users", shards = 1)
public class Users {

    private String name;
    private Long id;
    private String teamName;
    private Long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Users(String name, Long id, String teamName, Long salary) {

        this.name = name;
        this.id = id;
        this.teamName = teamName;
        this.salary = salary;
    }

    public Users() {

    }
}
