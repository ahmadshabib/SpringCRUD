package com.universalyazilim.universalodev.dao;

import com.universalyazilim.universalodev.model.Contact; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmad
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
    public Contact findByContactID(String contactID);
}
