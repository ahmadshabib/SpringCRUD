/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universalyazilim.universalodev.dao;


import com.universalyazilim.universalodev.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ahmad
 */

public interface RoleRepository extends JpaRepository<Role, Long>{
}
