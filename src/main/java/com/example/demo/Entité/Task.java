package com.example.demo.Entité;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.NonNull;

import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "La description ne doit pas être vide.")
    @Size(max = 255, message = "La description ne doit pas dépasser 255 caractères.")
    private String description;
    @NonNull
    private Date date_création;
    @NonNull
    private Date date_échéance;

    public Date getDate_création() {
        return date_création;
    }

    public Date getDate_échéance() {
        return date_échéance;
    }

    public void setDate_échéance(Date date_échéance) {
        this.date_échéance = date_échéance;
    }

    public void setDate_création(Date date_création) {
        this.date_création = date_création;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
