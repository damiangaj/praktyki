package pl.gaj.damian.praktykiapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pl.gaj.damian.praktykiapp.entities.Form;
import pl.gaj.damian.praktykiapp.exceptions.ResourceNotFoundException;
import pl.gaj.damian.praktykiapp.repositories.FormRepository;
import org.springframework.data.domain.Sort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class FormServiceImpl implements FormService{


    @Autowired
    private FormRepository formRepository;

    @Override
    public Form getFormById(String id) {
        return formRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Form not found with id " + id));
    }

    @Override
    public List<Form> getAllForms(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "updatedAt"));
        return formRepository.findAll(pageable).getContent();
    }



    @Override
    public Form createForm(Form form) {
        return formRepository.save(form);
    }

    @Override
    public Form updateForm(String id, Form formDetails) {
        Form form = formRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Form not found with id " + id));

        form.setFirstName(formDetails.getFirstName());
        form.setLastName(formDetails.getLastName());
        form.setPhone(formDetails.getPhone());
        form.setGender(formDetails.getGender());
        form.setHobbies(formDetails.getHobbies());

        return formRepository.save(form);
    }

    @Override
    public void deleteForm(String id) {
        Form form = formRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Form not found with id " + id));
        formRepository.delete(form);
    }

}
