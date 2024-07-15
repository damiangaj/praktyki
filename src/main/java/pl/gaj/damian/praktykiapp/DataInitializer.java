//package pl.gaj.damian.praktykiapp;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import pl.gaj.damian.praktykiapp.entities.Form;
//import pl.gaj.damian.praktykiapp.repositories.FormRepository;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class DataInitializer implements CommandLineRunner {
//
//    private final FormRepository formRepository;
//
//    @Autowired
//    public DataInitializer(FormRepository formRepository) {
//        this.formRepository = formRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Form form1 = new Form();
//        form1.setFirstName("John");
//        form1.setLastName("Doe");
//        form1.setPhone("123456789");
//        form1.setGender("Male");
//        form1.setHobbies("Reading, Running");
//
//        Form form2 = new Form();
//        form2.setFirstName("Jane");
//        form2.setLastName("Smith");
//        form2.setPhone("987654321");
//        form2.setGender("Female");
//        form2.setHobbies("Painting, Swimming");
//
//        Form form3 = new Form();
//        form3.setFirstName("Michael");
//        form3.setLastName("Johnson");
//        form3.setPhone("555666777");
//        form3.setGender("Male");
//        form3.setHobbies("Cooking, Tennis");
//
//        Form form4 = new Form();
//        form4.setFirstName("Emily");
//        form4.setLastName("Davis");
//        form4.setPhone("111222333");
//        form4.setGender("Female");
//        form4.setHobbies("Gardening, Yoga");
//
//        Form form5 = new Form();
//        form5.setFirstName("William");
//        form5.setLastName("Wilson");
//        form5.setPhone("444777999");
//        form5.setGender("Male");
//        form5.setHobbies("Photography, Fishing");
//
//        Form form6 = new Form();
//        form6.setFirstName("Sophia");
//        form6.setLastName("Moore");
//        form6.setPhone("666888000");
//        form6.setGender("Female");
//        form6.setHobbies("Hiking, Dancing");
//
//        Form form7 = new Form();
//        form7.setFirstName("James");
//        form7.setLastName("Brown");
//        form7.setPhone("333555777");
//        form7.setGender("Male");
//        form7.setHobbies("Traveling, Cycling");
//
//        Form form8 = new Form();
//        form8.setFirstName("Olivia");
//        form8.setLastName("Martinez");
//        form8.setPhone("999111333");
//        form8.setGender("Female");
//        form8.setHobbies("Drawing, Watching movies");
//
//        Form form9 = new Form();
//        form9.setFirstName("Alexander");
//        form9.setLastName("Garcia");
//        form9.setPhone("222444666");
//        form9.setGender("Male");
//        form9.setHobbies("Playing guitar, Programming");
//
//        Form form10 = new Form();
//        form10.setFirstName("Isabella");
//        form10.setLastName("Lopez");
//        form10.setPhone("777888999");
//        form10.setGender("Female");
//        form10.setHobbies("Reading books, Cooking");
//
//        List<Form> forms = Arrays.asList(form1, form2, form3, form4, form5, form6, form7, form8, form9, form10);
//        formRepository.saveAll(forms);
//    }
//}
