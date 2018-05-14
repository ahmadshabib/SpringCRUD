/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universalyazilim.universalodev.model;

/**
 *
 * @author ahmad
 */
import javax.persistence.*;
import java.util.Set;
import lombok.Data;

@Entity
@Data
@Table(name = "role")

public class Role {
    
    @Id
    private Long id;
    private String name;
    private Set<User> users;

}
