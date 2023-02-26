package dgryzhko.com.leadertesttask.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * @Author Dgryzhkov
 */
@Entity
@Table(name = "devices")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "serial_number", unique = true, nullable = false)
    private String serialNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "key", unique = true, nullable = false)
    private String key;

    @Column(name = "date_of_create")
    private LocalDateTime date_of_create;
}