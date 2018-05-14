package com.universalyazilim.universalodev.dao;

import com.universalyazilim.universalodev.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmad
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
