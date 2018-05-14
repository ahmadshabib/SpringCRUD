package com.universalyazilim.universalodev.model.base;

import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import org.springframework.data.annotation.CreatedDate;
import lombok.Data;


// This is a base for all other models.
/**
 *
 * @author Ahmad
 */
@MappedSuperclass
@Data
public class ModelBase {

    // To avoid lost update anomaly.
    @Version
    private Integer version;
    
    // Creation date of the inserted row
    @CreatedDate
    private Date createdDate;

}
