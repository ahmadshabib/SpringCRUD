package com.universalyazilim.universalodev.controlller;

import com.universalyazilim.universalodev.dao.ContactRepository;
import com.universalyazilim.universalodev.model.Contact;
import com.universalyazilim.universalodev.utilities.VerificationUtlis;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ahmad
 */
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> allContacts = contactRepository.findAll();
        return ResponseEntity.ok(allContacts);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{contactID}")
    public ResponseEntity<Contact> getContactByID(@PathVariable(name = "contactID", value = "contactID") String contactID) {
        Contact contact = contactRepository.findByContactID(contactID);
        return ResponseEntity.ok(contact);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/")
    public ResponseEntity saveContact(Contact contact) {
        if (VerificationUtlis.isValidEmailAddress(contact.getEmail()) && VerificationUtlis.isValidPhoneNumber(contact.getPhoneNumber()) ) {
            contactRepository.save(contact);
            return ResponseEntity.ok().build();

        }else {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{contactID}")
    public ResponseEntity deleteContactByID(@PathVariable(name = "contactID", value = "contactID") String contactID) {
        contactRepository.delete(contactID);
        return ResponseEntity.ok().build();
    }
}
