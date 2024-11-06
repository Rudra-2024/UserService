package com.rudra.userservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name = "tokens")
public class Tokens extends BaseModel{
    private String value;

    @ManyToOne
    private User user;
    private Date expiryAt;
}
