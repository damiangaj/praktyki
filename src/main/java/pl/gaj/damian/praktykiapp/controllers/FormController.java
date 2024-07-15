package pl.gaj.damian.praktykiapp.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.gaj.damian.praktykiapp.entities.Form;
import pl.gaj.damian.praktykiapp.services.FormService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Form")
public class FormController {

    @Autowired
    private FormService formService;

    @GetMapping("/form")
    public ResponseEntity<List<Form>> getAllForms(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "12") int size) {
        List<Form> forms = formService.getAllForms(page, size);
        return ResponseEntity.ok(forms);
    }


    @GetMapping("/form/{id}")
    public ResponseEntity<Form> getFormById(@PathVariable String id){
        Form form = formService.getFormById(id);
        return ResponseEntity.ok(form);
    }

    @PostMapping("/create-form")
    public ResponseEntity<Form> createForm(@RequestBody Form form){
        Form createdForm = formService.createForm(form);
        return ResponseEntity.status(201).body(createdForm);
    }

    @PatchMapping("/edit-form/{id}")
    public ResponseEntity<Form> updateForm(@PathVariable String id, @RequestBody Form formDetails){
        Form updatedForm = formService.updateForm(id, formDetails);
        return ResponseEntity.ok(updatedForm);
    }
//    @DeleteMapping("/delete-form/{id}")
//    public ResponseEntity<Void>  deleteForm(@PathVariable String id) {
//        formService.deleteForm(id);
//        return ResponseEntity.noContent().build();
//    }

}
