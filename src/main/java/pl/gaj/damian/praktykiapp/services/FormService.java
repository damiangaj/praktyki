package pl.gaj.damian.praktykiapp.services;

import org.springframework.web.multipart.MultipartFile;
import pl.gaj.damian.praktykiapp.entities.Form;

import java.io.IOException;
import java.util.List;

public interface FormService {
    Form getFormById(String id);
    public List<Form> getAllForms(int page, int size);
    public Form createForm(Form form);
    Form updateForm(String id, Form formDetails);
    void deleteForm(String id);
}
