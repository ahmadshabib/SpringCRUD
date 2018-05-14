package com.universalyazilim.universalodev.model;

import com.universalyazilim.universalodev.model.base.ModelBase;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import java.util.Date;

/**
 *
 * @author Ahmad
 */
@Entity
@Data
public class Contact extends ModelBase {

    @Id
    private String contactID;
    private String name;
    private String surname;
    private String email;
    private String adress;
    private String phoneNumber;
    private Date dateOfBirth;

}
