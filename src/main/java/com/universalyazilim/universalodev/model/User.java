package com.universalyazilim.universalodev.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import lombok.Data;


/**
 *
 * @author Ahmad
 */
@Entity
@Table(name = "users")
@Data
public class User implements Serializable {

    @Id
    private String username;
    private String password;
    @ManyToMany
    private Set<Role> roles;
  
}
