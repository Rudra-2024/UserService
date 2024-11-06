package com.rudra.userservice.Models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonDeserialize(as = Roles.class)
public class Roles extends BaseModel{
    private String role;
}
