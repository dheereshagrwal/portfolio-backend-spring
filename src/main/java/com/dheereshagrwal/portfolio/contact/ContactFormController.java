package com.dheereshagrwal.portfolio.contact;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactFormController {
    private final ContactFormRepository repository;

    public ContactFormController(ContactFormRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/contact")
    public ResponseEntity<ContactForm> addContactForm(@Valid @RequestBody ContactForm contactForm) {
        ContactForm savedContactForm = repository.save(contactForm);
        return new ResponseEntity<>(savedContactForm, HttpStatus.CREATED);
    }
    @GetMapping("/contact")
    public Iterable<ContactForm> getContactForms() {
        return repository.findAll();
    }
}