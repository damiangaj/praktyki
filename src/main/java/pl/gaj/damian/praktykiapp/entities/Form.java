package pl.gaj.damian.praktykiapp.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "forms")
@Data
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private String phone;
    @Column(name = "gender")
    private String gender;
    @Column(name = "hobbies")
    private String hobbies;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


}
