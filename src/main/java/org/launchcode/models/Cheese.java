package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by LaunchCode
 */
@Entity
public class Cheese {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    @NotNull
    @Size(min = 1, message = "Description must not be empty")
    private String description;

    @ManyToOne
    private Category category;  //when a Cheese object is stored, this column will contain the id of its category object. The data for the category object itself will go in the table for the Category class.

    @ManyToMany(mappedBy= "cheeses")  //tell Hibernate how to store and populate objects from the list, we specify that the field should be mappedBy the cheeses field of the Menu class
    private List<Menu> menus;

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Cheese() {
    }

    public int getId() {
        return id;
    }

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Menu> getMenus() {
        return menus;
    }
}





