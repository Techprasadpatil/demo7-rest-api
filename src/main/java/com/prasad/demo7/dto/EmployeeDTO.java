package com.prasad.demo7.dto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "name",
        "surname",
        "city",
        "result",
        "email"
})
public class EmployeeDTO {

    private Long id;

    private String name;

    private String surname;

    private String city;

    private String result;

    private String email;



    // Default Constructor
    public EmployeeDTO() {
    }

    // Parameterized Constructor
    public EmployeeDTO(Long id, String name, String surname,
                       String city, String result,
                       String email, String password) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.result = result;
        this.email = email;

    }

    // Getter and Setter Methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
